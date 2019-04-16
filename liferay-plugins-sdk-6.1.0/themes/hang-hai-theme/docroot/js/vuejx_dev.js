/**!
 * By Binhth
 */
(function () {

    function extend(a, b) {
        for (var key in b) {
            if (b.hasOwnProperty(key)) {
                a[key] = b[key];
            }
        }
        return a;
    }

    var VueJX = window.VueJX = function (options) {
        // Config
        extend(this.options, options);

        // Init function
        this._init();
    };

    VueJX.prototype = {
        options: {
            el: "default",
            pk: 0,
            groupid: 0,
            jxtemplate: "default",
            template: "default",
            data: "",
            schema: {}
        },

        _init: function () {

            var elDOMTEMP = document.getElementById(this.options.el);

            elDOMTEMP.innerHTML = '<v-app><v-form id="'+this.options.el+'_form" ref="form"  @submit.prevent.stop="javascript:;"></v-form>';

            var elDOM = document.getElementById(this.options.el + "_form");

            if (this.options.template === "default"){
                var jxtemplate = document.getElementById(this.options.jxtemplate);
                
                if (jxtemplate != null) {
                    jxtemplate.className = "";
                    elDOM.appendChild(jxtemplate);
                }
            } else {
                elDOM += this.options.template;
            }

            var schema = this.options.schema;
            
            var dataResult = {}, computedBuilder = {}, watchBuilder = {}, methodsBuilder = {};
            var computedBuilderG = {}, watchBuilderG = {}, methodsBuilderG = {};
            var mountedG = ' ';
            //builder schema
            var schemaBuilder = {};

            for (var key in this.options.data) {
                
                var initData = this.options.data[key];
                
                dataResult[key] = initData;

            }
			
            for (var key in schema) {

                var detailSchema = schema[key];

                dataResult[detailSchema.name] = null;
                dataResult[detailSchema.type] = detailSchema.type;
                dataResult['searchQueryIsDirty'] = false;
                dataResult['isCalculating'] = false;
                dataResult[detailSchema.name+"_hidden"] = false;
                dataResult[detailSchema.name+"_hidden_loading"] = false;
				dataResult[detailSchema.name+'pk'] = 0;

                var rules = '', textBuilder = ' ';

                if (detailSchema.type === 'select') {
                    dataResult[detailSchema.name] = []
                } else if (detailSchema.type === 'action') {
                    dataResult[detailSchema.name+'Items'] = []
                }
                

                if (detailSchema.hasOwnProperty("mode") && detailSchema.type !== 'select' ) {
                    dataResult[detailSchema.name+"_hidden"] = true;
                    dataResult[detailSchema.name+"_editable_value_text"] = '';
					dataResult[detailSchema.name+"permission"] = 'write';

                    var editable_value_text = detailSchema.name;

                    if(detailSchema.type === 'switch' || detailSchema.type === 'checkbox'){
                        
                        watchBuilder = eval('( { '+
                                                detailSchema.name+': { '+
                                                    'handler: function(val, oldVal) { '+
                                                        'var tempEditableText = [] ; ' +
                                                        ' for (var key in val) { ' +
                                                            ' if (val.hasOwnProperty(key)) { ' +
                                                                'tempEditableText.push(val[key]) ; ' +
                                                            ' } ' +
                                                        ' } ' +
                                                        ' this.'+detailSchema.name+'_editable_value_text = tempEditableText.toString() ' +
                                                    '}' +
                                                '} '+
                                            '} )');
                        editable_value_text = detailSchema.name+"_editable_value_text";
                    } else {
                        editable_value_text = detailSchema.name;
                    }
                        
                    

                    textBuilder += '<div class="editable-wrap"> <div class="layout wrap"> <div class="labelClass flex '+detailSchema.labelClass+'"> '+detailSchema.label+' </div> <div class="controlClass flex '+detailSchema.controlClass+'"> <div v-if="'+detailSchema.name+'_hidden" class="editable__content__value" > <span v-if="'+editable_value_text+'">{{'+editable_value_text+'}}</span> <i class="text-gray" v-else>Chưa có</i> </div> ';
                } else if (detailSchema.hasOwnProperty("mode") && detailSchema.type === 'select' ) {
                    dataResult[detailSchema.name+"_hidden"] = true;
                    dataResult[detailSchema.name+"permission"] = 'write';
                    var editable_value_value = detailSchema.name;
                    textBuilder += '<div :class="{'+"'editable-wrap': true, " +"'editable-wrap-before-select': "+detailSchema.name+"_hidden, "+"'editable-wrap-after-select': !" + detailSchema.name + '_hidden }"> ';
                    textBuilder += '<div class="layout wrap"> <div class="labelClass flex '+detailSchema.labelClass+'"> '+detailSchema.label+' </div> <div class="controlClass flex '+detailSchema.controlClass+'"> <div v-if="'+editable_value_value+'.length <= 0" class="editable__content__value" style="position: absolute;"><i class="text-gray">Chưa có</i></div> ';
                    
                } else if (detailSchema.hasOwnProperty("filter") && detailSchema.type === 'select' ) {
                    dataResult[detailSchema.name+"_hidden"] = true;
                    textBuilder += '<div :class="{'+"'editable-wrap-filter': true, " +"'editable-wrap-before-select': "+detailSchema.name+"_hidden, "+"'editable-wrap-after-select': !" + detailSchema.name + '_hidden }"> ';
                }

                

                if (detailSchema.type === 'password' || detailSchema.type === 'text' || detailSchema.type === 'email' || detailSchema.type === 'number' || detailSchema.type === 'hidden') {
                    
                    textBuilder += '<v-text-field ';
                    
                    textBuilder += ' v-model="' + detailSchema.name + '" ' ;

                    if (detailSchema.hasOwnProperty("mode")) {
                        textBuilder += ' v-if="!' + detailSchema.name + '_hidden" ' ;
                    }

                    if (detailSchema.type === 'hidden') {
                        textBuilder += ' v-show="false"' ;
                    }

                    //password
                    if (detailSchema.type === 'password') {
                        dataResult[detailSchema.name+"_show"] = false;
                        textBuilder += ' :append-icon="' + detailSchema.name + '_show ? ' + " 'visibility' " + ' : ' + " 'visibility_off' " + ' " ' ;
                        textBuilder += ' :append-icon-cb="() => ( ' + detailSchema.name + '_show = !' + detailSchema.name + '_show)"' ;
                        textBuilder += ' :type="' + detailSchema.name + '_show ? '+"'text'"+' : '+"'password'"+'"' ;
                    }

                    if (detailSchema.hasOwnProperty("cssClass")) {
                        textBuilder += ' class="'+detailSchema.cssClass+'" ' ;
                    }

                    if (detailSchema.hasOwnProperty("append_icon")) {
                        
                        textBuilder += ' append-icon="' + detailSchema.append_icon + '" ' ;
                            
                    } else if (detailSchema.hasOwnProperty("prepend_icon")) {
                            
                        textBuilder += ' prepend-icon="' + detailSchema.prepend_icon + '" ' ;
                            
                    }

                    if (detailSchema.hasOwnProperty("required")) {

                        var messageValidatorRequired = '';

                        if (detailSchema.hasOwnProperty("required_msg")) {
                            messageValidatorRequired = detailSchema.required_msg;
                        } else {
                            messageValidatorRequired = 'This field is required! ';
                        }

                        dataResult['rules'+detailSchema.name] = {
                            required: eval(' { (v) => !!v || '+"'"+messageValidatorRequired+"'"+' } ')
                        };

                        rules = ' :rules="[rules'+detailSchema.name+'.required]" ';
                        
                        textBuilder += ' required ';

                    } 
                    
                    if (detailSchema.type === 'number') {

                        var messageErrorRequired = '';

                        if (detailSchema.hasOwnProperty("error_msg")) {
                            messageErrorRequired = detailSchema.error_msg;
                        } else {
                            messageErrorRequired = 'This field is number and not null! ';
                        }

                        var re = /^\d+$/;

                        dataResult[detailSchema.name] = "0";

                        dataResult['rules'+detailSchema.name] = {
                            required: eval(' { (v) => !!v || '+"'"+messageErrorRequired+"'"+' } '),
                            number: eval(' { (v) => '+re+'.test(v) || '+"'"+messageErrorRequired+"'"+' } ')
                        };

                        rules = ' :rules="[rules'+detailSchema.name+'.required, rules'+detailSchema.name+'.number]" ';

                    } else if (detailSchema.type === 'email') {

                        var messageErrorRequired = '';
                        
                        if (detailSchema.hasOwnProperty("error_msg")) {
                            messageErrorRequired = detailSchema.error_msg;
                        } else {
                            messageErrorRequired = 'This field is email and not null! ';
                        }

                        var re = /^(([^<>()[\]\\.,;:\s@\"]+(\.[^<>()[\]\\.,;:\s@\"]+)*)|(\".+\"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;

                        dataResult['rules'+detailSchema.name] = {
                            required: eval(' { (v) => !!v || '+"'"+messageErrorRequired+"'"+' } '),
                            email: eval(' { (v) => '+re+'.test(v) || '+"'"+messageErrorRequired+"'"+' } ')
                        };

                        rules = ' :rules="[rules'+detailSchema.name+'.required, rules'+detailSchema.name+'.email]" ';

                    } else {

                        if (detailSchema.hasOwnProperty("min") && detailSchema.hasOwnProperty("counter")) {
                            
                            var messageValidatorMin = '';
                            var messageValidatorCounter = '';

                            if (detailSchema.hasOwnProperty("hint")) {
                                messageValidatorMin = detailSchema.hint;
                            } else {
                                messageValidatorMin = 'This field is minimum ' + detailSchema.min + " characters";
                            }

                            if (detailSchema.hasOwnProperty("counter_hint")) {
                                messageValidatorCounter = detailSchema.counter_hint;
                            } else {
                                messageValidatorCounter = 'This field is maximum ' + detailSchema.counter + " characters";
                            }
                            
                            dataResult['rules'+detailSchema.name] = {
                                required: eval(' { (v) => !!v || '+"'"+messageValidatorMin+"'"+' } '),
                                min: eval(' { (v) => v && v.length > '+detailSchema.min+' || '+"'"+messageValidatorMin+"'"+' } '),
                                counter: eval(' { (v) => v && v.length < '+detailSchema.counter+' || '+"'"+messageValidatorCounter+"'"+' } ')
                            };

                            rules = ' :rules="[rules'+detailSchema.name+'.required, rules'+detailSchema.name+'.min, rules'+detailSchema.name+'.counter]" ';
                            
                            textBuilder += ' min="' + detailSchema.min + '" ';

                            textBuilder += ' :counter="' + detailSchema.counter + '" required ';

                        } else if (detailSchema.hasOwnProperty("counter")) {
                            
                            var messageValidatorCounter = '';

                            if (detailSchema.hasOwnProperty("counter_hint")) {
                                messageValidatorCounter = detailSchema.counter_hint;
                            } else {
                                messageValidatorCounter = 'This field is maximum ' + detailSchema.counter + " characters";
                            }

                            dataResult['rules'+detailSchema.name] = {
                                counter: eval(' { (v) => v && v.length < '+detailSchema.counter+' || '+"'"+messageValidatorCounter+"'"+' } ')
                            };

                            rules = ' :rules="[rules'+detailSchema.name+'.counter]" ';

                            textBuilder += ' :counter="' + detailSchema.counter + '" ';

                        } else if (detailSchema.hasOwnProperty("min")) {


                            var messageValidatorMin = '';
                            
                            if (detailSchema.hasOwnProperty("hint")) {
                                messageValidatorMin = detailSchema.hint;
                            } else {
                                messageValidatorMin = 'This field is minimum ' + detailSchema.min + " characters";
                            }
                            var dkm = detailSchema.min;
                            
                            dataResult['rules'+detailSchema.name] = {
                                required: eval(' { (v) => !!v || '+"'"+messageValidatorMin+"'"+' } '),
                                min: eval(' { (v) => v && v.length > '+detailSchema.min+' || '+"'"+messageValidatorMin+"'"+' } ')
                            };

                            rules = ' :rules="[rules'+detailSchema.name+'.required, rules'+detailSchema.name+'.min]" ';
                            
                            textBuilder += ' min="' + detailSchema.min + '" required ';

                        }

                    }

                    if (detailSchema.hasOwnProperty("hint")) {

                        textBuilder += ' hint="' + detailSchema.hint + '" ';

                    }

                    if (detailSchema.hasOwnProperty("label")) {

                        textBuilder += ' label="' + detailSchema.label + '" ';

                    }

                    if (detailSchema.hasOwnProperty("name")) {

                        textBuilder += ' name="' + detailSchema.name + '" ';

                    }
                    
                    if (detailSchema.hasOwnProperty("autofocus") && detailSchema.autofocus) {
                        
                        textBuilder += ' autofocus ';
                        
                    }

                    if (detailSchema.hasOwnProperty("box") && detailSchema.box) {
                        
                        textBuilder += ' box ';
                        
                    }

                    if (detailSchema.hasOwnProperty("dark") && detailSchema.dark) {
                        
                        textBuilder += ' dark ';
                        
                    }

                    if (detailSchema.hasOwnProperty("light") && detailSchema.light) {
                        
                        textBuilder += ' light ';
                        
                    }
                    
                    if (detailSchema.hasOwnProperty("color")) {
                        
                        textBuilder += ' color="'+detailSchema.color+'" ';
                        
                    }

                    if (detailSchema.hasOwnProperty("disabled") && detailSchema.disabled) {
                        
                        textBuilder += ' disabled ';
                        
                    }

                    if (detailSchema.hasOwnProperty("hide_details") && detailSchema.hide_details) {
                        
                        textBuilder += ' hide-details ';
                        
                    }

                    if (detailSchema.hasOwnProperty("persistent_hint") && detailSchema.persistent_hint) {
                        
                        textBuilder += ' persistent-hint ';
                        
                    }

                    if (detailSchema.hasOwnProperty("placeholder")) {
                        
                        textBuilder += ' placeholder="'+detailSchema.placeholder+'" ';
                        
                    }

                    if (detailSchema.hasOwnProperty("readonly") &&  detailSchema.readonly) {
                        
                        textBuilder += ' readonly ';
                        
                    }

                    if (detailSchema.hasOwnProperty("validate_on_blur") &&  detailSchema.validate_on_blur) {
                        
                        textBuilder += ' validate-on-blur ';
                        
                    }

                    if (detailSchema.hasOwnProperty("multi_line") &&  detailSchema.multi_line) {
                        
                        textBuilder += ' multi-line ';
                        
                    }

                    if (detailSchema.hasOwnProperty("textarea") &&  detailSchema.textarea) {
                        
                        textBuilder += ' textarea ';
                        
                    }

                    if (detailSchema.hasOwnProperty("rows")) {
                        
                        textBuilder += ' rows="'+detailSchema.rows+'" ';
                        
                    }
                    
                    if (detailSchema.hasOwnProperty("single_line") &&  detailSchema.single_line) {
                        
                        textBuilder += ' single-line ';
                        
                    }

                    if (detailSchema.hasOwnProperty("solo") &&  detailSchema.solo) {
                        
                        textBuilder += ' solo ';
                        
                    }

                    if (detailSchema.hasOwnProperty("auto_grow") &&  detailSchema.auto_grow) {
                        
                        textBuilder += ' auto-grow ';
                        
                    }

                    if (detailSchema.hasOwnProperty("mask")) {
                        
                        textBuilder += ' mask="' + detailSchema.mask + '" ';
                        
                    }

                    if (detailSchema.hasOwnProperty("return_masked_value") &&  detailSchema.return_masked_value) {
                        
                        textBuilder += ' return-masked-value ';
                        
                    }

                    if (detailSchema.hasOwnProperty("dont_fill_mask_blanks") &&  detailSchema.dont_fill_mask_blanks) {
                        
                        textBuilder += ' dont-fill-mask-blanks ';
                        
                    }
                    
                    if (detailSchema.hasOwnProperty("full_width") &&  detailSchema.full_width) {
                        
                        textBuilder += ' full-width ';
                        
                    }

                    if (detailSchema.hasOwnProperty("tabindex")) {
                        
                        textBuilder += ' tabindex="' + detailSchema.tabindex + '" ';
                        
                    }

                    if (detailSchema.hasOwnProperty("toggle_keys")) {
                        
                        textBuilder += ' toggle-keys="' + detailSchema.toggle_keys + '" ';
                        
                    }

                    if (detailSchema.hasOwnProperty("prefix")) {
                        
                        textBuilder += ' prefix="' + detailSchema.prefix + '" ';
                        
                    }

                    if (detailSchema.hasOwnProperty("suffix")) {
                        
                        textBuilder += ' suffix="' + detailSchema.suffix + '" ';
                        
                    }

                    if (detailSchema.hasOwnProperty("error") && detailSchema.error) {
                        
                        textBuilder += ' error ';
                        
                    }

                    if (detailSchema.hasOwnProperty("error_messages")) {
                        
                        textBuilder += ' error-messages="' + detailSchema.error_messages + '" ';
                        
                    }

                    textBuilder += '  ';

                    var eventTextBuilder = ' ';

                    if ( detailSchema.hasOwnProperty("onClick") ) {
                        eventTextBuilder += ' v-on:click.native=' + detailSchema.onClick;
                    }

                    if ( detailSchema.hasOwnProperty("onChange") ) {
                        eventTextBuilder += ' v-on:change.native=' + detailSchema.onChange;
                    }

                    if ( detailSchema.hasOwnProperty("onKeyup") ) {
                        eventTextBuilder += ' @keyup.native=' + detailSchema.onKeyup;
                    }

                    if ( detailSchema.hasOwnProperty("onEnter") ) {
                        eventTextBuilder += ' @@keyup.enter=' + detailSchema.onEnter;
                    }

                    textBuilder += rules + ' '+eventTextBuilder+' ></v-text-field> ';
                    
                    if (detailSchema.hasOwnProperty("indicator") && detailSchema.indicator) {
                        
                        textBuilder += '<small class="jx-indicator">{{ '+"searchIndicator"+detailSchema.name+' }}</small>';

                    }

                } else if (detailSchema.type === 'time' || detailSchema.type === 'date' || detailSchema.type === 'month'){
                    //date time
                    
                    dataResult['modal'+detailSchema.name] = "";

                    textBuilder += ' <v-menu lazy offset-y :close-on-content-click="true" transition="scale-transition" :nudge-top="40" full-width max-width="290px" min-width="290px" ';
                    if (detailSchema.hasOwnProperty("mode")) {
                        textBuilder += ' v-if="!' + detailSchema.name + '_hidden" ' ;
                    }
                    textBuilder += ' v-model="modal' + detailSchema.name + '" > ' ;
                    
                    //input
                    textBuilder += ' <v-text-field slot="activator" ' ;

                    if (detailSchema.hasOwnProperty("placeholder")) {
                        
                        textBuilder += ' placeholder="'+detailSchema.placeholder+'" ';
                        
                    }

                    if (detailSchema.hasOwnProperty("required")) {
                        
                        var messageValidatorRequired = '';

                        if (detailSchema.hasOwnProperty("required_msg")) {
                            messageValidatorRequired = detailSchema.required_msg;
                        } else {
                            messageValidatorRequired = 'This field is required! ';
                        }

                        dataResult['rules' + detailSchema.name] = {
                            required: eval(' { (v) => !!v || ' + "'" + messageValidatorRequired + "'" + ' } ')
                        };
                        
                        rules = ' :rules="[rules' + detailSchema.name+'.required]" ';

                        textBuilder += ' required ';

                    }

                    textBuilder += ' v-model="' + detailSchema.name + '" ' ;
                    

                    if (detailSchema.hasOwnProperty("label")) {
                        
                        textBuilder += ' label="' + detailSchema.label + '" ' ;
                        
                    }

                    if (detailSchema.hasOwnProperty("append_icon")) {
                        
                        textBuilder += ' append-icon="' + detailSchema.append_icon + '" ' ;
                        
                    }

                    if (detailSchema.hasOwnProperty("prepend_icon")) {
                        
                        textBuilder += ' prepend-icon="' + detailSchema.prepend_icon + '" ' ;
                        
                    }
                                        
                    dataResult[detailSchema.name+'Formatted'] = "";
                        
                    textBuilder += ' @blur="'+detailSchema.name+'Formatted'+' = parseDate'+detailSchema.name+'(this.'+detailSchema.name+')" ' ;
                      
                    textBuilder += ' '+rules+' ></v-text-field> ' ;
                        
                    if (detailSchema.type === 'time') {
                        
                        textBuilder += ' <v-time-picker v-model="' + detailSchema.name + '" autosave locale="vi" ' ;
                    
                    } else if (detailSchema.type === 'date') {

                        textBuilder += ' <v-date-picker required v-model="' + detailSchema.name + 'Formatted " autosave locale="vi" ' ;

                    } else if (detailSchema.type === 'month') {
                        
                        textBuilder += ' <v-date-picker type="month" v-model="' + detailSchema.name + '" autosave locale="vi" ' ;
                        
                    }
                    
                    if (detailSchema.hasOwnProperty("format")) {
                        
                        textBuilder += ' format="'+detailSchema.format+')" ' ;
                        
                    }

                    if (detailSchema.hasOwnProperty("color")) {
                        
                        textBuilder += ' color="' + detailSchema.color + '" > ' ;
                        
                    }

                    if (detailSchema.hasOwnProperty("header_color")) {
                        
                        textBuilder += ' header-color="' + detailSchema.header_color + '" ' ;
                        
                    }

                    if (detailSchema.hasOwnProperty("dark") && detailSchema.dark) {
                        
                        textBuilder += ' dark ' ;
                        
                    }

                    if (detailSchema.hasOwnProperty("light") && detailSchema.light) {
                        
                        textBuilder += ' light ' ;
                        
                    }

                    if (detailSchema.hasOwnProperty("locale")) {
                        
                        textBuilder += ' locale="' + detailSchema.locale + '" ' ;
                        
                    } else {
	                     textBuilder += ' locale="vi" ' ;
                    }

                    if (detailSchema.hasOwnProperty("no_title") && detailSchema.no_title) {
                        
                        textBuilder += ' no-title ' ;
                        
                    }
                    
                    if (detailSchema.hasOwnProperty("year_icon")) {
                        
                        textBuilder += ' year-icon="' + detailSchema.year_icon + '" ' ;
                        
                    }
                    
                    textBuilder += ' @input="'+detailSchema.name+' = formatDate'+detailSchema.name+'($event)" ' ;
                       
                    if (detailSchema.hasOwnProperty("allowed_dates") && detailSchema.type !== 'time') {
                        
                        dataResult[detailSchema.allowed_dates] = {
                            min: null,
                            max: null
                        };

                        textBuilder += ' :allowed-dates="' + detailSchema.allowed_dates + '" ';

                    } else {
                        dataResult[detailSchema.allowed_dates] = {
                            hours: {
                                min: 0,
                                max: 24
                            },
                            minutes: {
                                min: 0,
                                max: 60
                            }
                        };

                        textBuilder += ' :allowed-hours="' + detailSchema.allowed_dates + '.hours" ';
                        textBuilder += ' :allowed-minutes="' + detailSchema.allowed_dates + '.minutes" ';
                    }
                    
                    if (detailSchema.hasOwnProperty("onClick")) {
                        textBuilder += ' v-on:click.native=' + detailSchema.onClick;
                    }
                    
                    textBuilder += '  ';

                    if (detailSchema.type === 'time') {
                        
                        textBuilder += ' ></v-time-picker> </v-menu> ';
                    
                    } else {
                        
                        textBuilder += ' ></v-date-picker> </v-menu> ';
                        
                    }
                    
                }  else if (detailSchema.type === 'timeview' || detailSchema.type === 'dateview' || detailSchema.type === 'monthview'){
                    //date time
                        
                    if (detailSchema.type === 'timeview') {
                        
                        textBuilder += ' <v-time-picker v-model="' + detailSchema.name + '" autosave ' ;
                    
                    } else if (detailSchema.type === 'dateview') {

                        textBuilder += ' <v-date-picker v-model="' + detailSchema.name + '" autosave ' ;

                    } else if (detailSchema.type === 'monthview') {
                        
                        textBuilder += ' <v-date-picker type="month" v-model="' + detailSchema.name + '" autosave ' ;
                        
                    }
                    
                    if (detailSchema.hasOwnProperty("format")) {
                        
                        textBuilder += ' format="'+detailSchema.format+')" ' ;
                        
                    }

                    if (detailSchema.hasOwnProperty("color")) {
                        
                        textBuilder += ' color="' + detailSchema.color + '" > ' ;
                        
                    }

                    if (detailSchema.hasOwnProperty("header_color")) {
                        
                        textBuilder += ' header-color="' + detailSchema.header_color + '" ' ;
                        
                    }

                    if (detailSchema.hasOwnProperty("dark") && detailSchema.dark) {
                        
                        textBuilder += ' dark ' ;
                        
                    }

                    if (detailSchema.hasOwnProperty("light") && detailSchema.light) {
                        
                        textBuilder += ' light ' ;
                        
                    }

                    if (detailSchema.hasOwnProperty("locale")) {
                        
                        textBuilder += ' locale="' + detailSchema.locale + '" ' ;
                        
                    }

                    if (detailSchema.hasOwnProperty("no_title") && detailSchema.no_title) {
                        
                        textBuilder += ' no-title ' ;
                        
                    }
                    
                    if (detailSchema.hasOwnProperty("year_icon")) {
                        
                        textBuilder += ' year-icon="' + detailSchema.year_icon + '" ' ;
                        
                    }

                    if (detailSchema.hasOwnProperty("allowed_dates") && detailSchema.type !== 'timeview') {

                        dataResult[detailSchema.allowed_dates] = {
                            min: null,
                            max: null
                        };

                        textBuilder += ' :allowed-dates="' + detailSchema.allowed_dates + '" ';

                    } else {
                        dataResult[detailSchema.allowed_dates] = {
                            hours: {
                              min: 0,
                              max: 24
                            },
                            minutes: {
                              min: 0,
                              max: 60
                            }
                          };

                        textBuilder += ' :allowed-hours="' + detailSchema.allowed_dates + '.hours" ';
                        textBuilder += ' :allowed-minutes="' + detailSchema.allowed_dates + '.minutes" ';
                    }

                    var eventDateTimeBuilder;

                    if (detailSchema.hasOwnProperty("onClick")) {
                        eventDateTimeBuilder += ' v-on:click.native="' + detailSchema.onClick + '"';
                    }

                    textBuilder += ' ' + eventDateTimeBuilder + ' ';

                    if (detailSchema.type === 'timeview') {
                        
                        textBuilder += ' ></v-time-picker> ';
                    
                    } else {
                        
                        textBuilder += ' ></v-date-picker> ';
                        
                    }
                    
                } else if (detailSchema.type === 'slider'){
                        
                    textBuilder += ' <v-slider v-model="' + detailSchema.name + '" thumb-label ticks ';
                    
                    if (detailSchema.hasOwnProperty("step")) {
                        
                        textBuilder += ' step="' + detailSchema.step + '" ' ;
                        
                    }

                    if (detailSchema.hasOwnProperty("label")) {
                        
                        textBuilder += ' label="'+detailSchema.label+'" ' ;
                                                
                    }

                    if (detailSchema.hasOwnProperty("color")) {
                        
                        textBuilder += ' color="'+detailSchema.color+'" ' ;
                                                
                    }

                    if (detailSchema.hasOwnProperty("track_color")) {
                        
                        textBuilder += ' track-color="'+detailSchema.track_color+'" ' ;
                                                
                    }

                    if (detailSchema.hasOwnProperty("thumb_color")) {
                        
                        textBuilder += ' thumb-color="'+detailSchema.thumb_color+'" ' ;
                                                
                    }

                    if (detailSchema.hasOwnProperty("input")) {
                        
                        textBuilder += ' @input="'+detailSchema.input+'" ' ;
                                                
                    } else if (!detailSchema.hasOwnProperty("input") && detailSchema.hasOwnProperty("updateapi")) {
                        
                        textBuilder += ' @input="'+detailSchema.name+'UpdateAPIFnc" ' ;
                                                
                    }
                    
                    textBuilder += ' ></v-slider> ';
                    
                }   else if (detailSchema.type === 'rating'){
                    
                    textBuilder += ' <jx-rate v-model="'+detailSchema.name+'" show-text ';

                    if (detailSchema.hasOwnProperty('ratings')) {
                        dataResult[detailSchema.ratings] = [];
                        textBuilder += ' :ratings="'+detailSchema.ratings+'" ';
                    }
                    
                    if (detailSchema.hasOwnProperty('call_back_success')) {
                        textBuilder += ' @call-back-success="'+detailSchema.call_back_success+'" ';
                    }

                    if (detailSchema.hasOwnProperty('call_back_error')) {
                        textBuilder += ' @call-back-error="'+detailSchema.call_back_error+'" ';
                    }

                    if (detailSchema.hasOwnProperty('show_text') && detailSchema.show_text) {
                        textBuilder += ' show-text ';
                    }

                    if (detailSchema.hasOwnProperty('updateapi')) {
                        dataResult[detailSchema.name+"updateapi"] = [detailSchema.updateapi];
                        textBuilder += ' :updateapi="'+detailSchema.name+"updateapi"+'" ';
                    }

                    textBuilder += ' :pk="'+ detailSchema.name + 'pk'+'" ';

                    textBuilder += ' :groupid="'+this.options.groupid+'" ';

                    textBuilder += ' ></jx-rate> ';
                    
                }   else if (detailSchema.type === 'select'){
                    
                    dataResult[detailSchema.name+"_keywords"] = [detailSchema.updateapi];

                    var eventSelectBuilder = ' ';

                    textBuilder += ' <v-select v-model="' + detailSchema.name + '"';
                    
                    if (detailSchema.hasOwnProperty("required")) {
                        
                        var messageValidatorRequired = '';

                        if (detailSchema.hasOwnProperty("required_msg")) {
                            messageValidatorRequired = detailSchema.required_msg;
                        } else {
                            messageValidatorRequired = 'This field is required! ';
                        }

                        dataResult['rules' + detailSchema.name] = {
                            required: eval(' { (v) => !!v || ' + "'" + messageValidatorRequired + "'" + ' } ')
                        };
                        
                        rules = ' :rules="[rules' + detailSchema.name+'.required]" ';

                        textBuilder += ' required ';

                    }
                    
                    if (detailSchema.hasOwnProperty("items")) {
                        
                        dataResult[detailSchema.name+'Items'] = detailSchema.items;

                        textBuilder += ' v-bind:items="this.'+detailSchema.name+'Items" ' ;
                                                
                    }

                    if (detailSchema.hasOwnProperty("item_text")) {
                        
                        textBuilder += ' item-text="' + detailSchema.item_text + '" ' ;
                        
                    }

                    if (detailSchema.hasOwnProperty("item_value")) {
                        
                        textBuilder += ' item-value="' + detailSchema.item_value + '" ' ;
                        
                    }

                    if (detailSchema.hasOwnProperty("tags") && detailSchema.tags) {
                        
                        textBuilder += ' tags ' ;

                        textBuilder += ' @input="'+detailSchema.name+'InputEvent()" ' ;
                        
                    }
                    if (detailSchema.hasOwnProperty("label")) {

                        textBuilder += ' label="' + detailSchema.label + '" ';

                    }

                    if (detailSchema.hasOwnProperty("append_icon")) {

                        textBuilder += ' append-icon="' + detailSchema.append_icon + '" ';

                    }

                    if (detailSchema.hasOwnProperty("prepend_icon")) {

                        textBuilder += ' prepend-icon="' + detailSchema.prepend_icon + '" ';

                    }

                    if (detailSchema.hasOwnProperty("chips") && detailSchema.chips) {

                        textBuilder += ' chips ';

                    }

                    if (detailSchema.hasOwnProperty("multiple") && detailSchema.multiple) {

                        textBuilder += ' multiple ';

                    }

                    if (detailSchema.hasOwnProperty("color") ) {
                        
                        textBuilder += ' color="'+detailSchema.color+'" ';

                    }
                    
                    if (detailSchema.hasOwnProperty("combobox") && detailSchema.combobox) {
                        
                        textBuilder += ' combobox ';

                    }                     

                    if (detailSchema.hasOwnProperty("onClick")) {
                        eventSelectBuilder += ' v-on:click.native=' + detailSchema.onClick;
                    }

                    if (detailSchema.hasOwnProperty("onChange")) {
                        eventSelectBuilder += ' @change=' + detailSchema.onChange;
                    }

                    if (detailSchema.hasOwnProperty("onKeyup")) {
                        eventSelectBuilder += ' @keyup.native=' + detailSchema.onKeyup;
                    }
                    
                    if (detailSchema.hasOwnProperty("dark") && detailSchema.dark) {
                        
                        textBuilder += ' dark ';

                    }  
                    if (detailSchema.hasOwnProperty("light") && detailSchema.light) {
                        
                        textBuilder += ' dark ';

                    }  
                    if (detailSchema.hasOwnProperty("hide_selected") && detailSchema.hide_selected) {
                        
                        textBuilder += ' hide-selected ';

                    } 
                    if (detailSchema.hasOwnProperty("hint")) {
                        
                        textBuilder += ' hint='+"'"+detailSchema.hint+"'"+'';

                    }   
                    
                    if (detailSchema.hasOwnProperty("loading") && detailSchema.loading) {
                        
                        textBuilder += ' loading ';

                    }   

                    if (detailSchema.hasOwnProperty("no_data_text")) {
                        
                        textBuilder += ' no-data-text='+"'"+detailSchema.no_data_text+"'"+' ';

                    } 
                    
                    if (detailSchema.hasOwnProperty("single_line") && detailSchema.single_line) {
                        
                        textBuilder += ' single-line ';

                    } 
                    
                    if (detailSchema.hasOwnProperty("solo") && detailSchema.solo) {
                        
                        textBuilder += ' solo ';

                    } 

                    if (detailSchema.hasOwnProperty("tabindex")) {
                        
                        textBuilder += ' tabindex='+"'"+detailSchema.tabindex+"'"+' ';

                    } 
                    
                    textBuilder +=  ' '+rules+' ' + eventSelectBuilder +' autocomplete return-object >';
                    
                    if (detailSchema.hasOwnProperty("chips") && detailSchema.chips) {
                        
                        textBuilder += ' <template slot="selection" slot-scope="data"> ' ;

                        textBuilder += ' <v-chip :selected="data.selected" :disabled="data.disabled" class="chip--select-multi" :key="JSON.stringify(data.item)" ' ;
                       
                        if(detailSchema.hasOwnProperty("deletable_chips") && detailSchema.deletable_chips){
                            textBuilder += ' close ';
                        }
                        textBuilder += ' @click="'+detailSchema.onRemove+'(data.item)" ' ;
                        textBuilder += ' @input="data.parent.selectItem(data.item)" ' ;
                        
                        textBuilder += ' >';
                        
                        if (detailSchema.hasOwnProperty("item_text_adv")) {
                            textBuilder += ' {{ data.item.'+detailSchema.item_text_adv+' }} ';
                        } else {
                            textBuilder += ' {{ data.item.'+detailSchema.item_text+' }} ';
                        }

                        textBuilder += '</v-chip> ' ;

                        textBuilder += ' </template> ' ;
                        
                        textBuilder += ' <template slot="item" slot-scope="data"> ' ;
                        if (detailSchema.hasOwnProperty("item_text_adv")) {
                            textBuilder += ' {{ data.item.'+detailSchema.item_text_adv+' }} ';
                        } else {
                            textBuilder += ' {{ data.item.'+detailSchema.item_text+' }} ';
                        }
                        textBuilder += ' </template> ' ;
                    }

                    textBuilder += '</v-select> ';
                    
                } else if (detailSchema.type === 'switch' || detailSchema.type === 'checkbox' || detailSchema.type === 'radio'){
                    var eventSwitchBuilder = ' ';

                    if (detailSchema.hasOwnProperty("label")) {
                        
                        var switch_inline = '';

                        if (detailSchema.hasOwnProperty("switch_inline") && detailSchema.switch_inline) {
                            switch_inline += ' input-group--switch_inline ';
                        }

                        if (!detailSchema.hasOwnProperty("labelClass") && !detailSchema.hasOwnProperty("controlClass")){
                            switch_inline += ' input-group--full_label ';
                        }

                        textBuilder += ' <div v-if="!'+detailSchema.name+'_hidden" class="layout row wrap '+switch_inline+' "> ';
                        
                        if(!detailSchema.hasOwnProperty("mode")){
                            textBuilder += ' <div class="flex switch-label '+detailSchema.labelClass+'"> <label class="switch-middle">'+detailSchema.label+'</label> ';
                            textBuilder += ' </div> <div class="flex switch-control '+detailSchema.controlClass+'"> ';
                        }
                        if (detailSchema.hasOwnProperty("items")) {

                            dataResult[detailSchema.name+'Items'] = detailSchema.items;
                            dataResult[detailSchema.name+'loadingGroup'] = false;
                            var cssClass = '';

                            if ( detailSchema.hasOwnProperty("cssClass") ) {
                                cssClass +=  detailSchema.cssClass;
                            }

                            if(detailSchema.type === 'radio'){
                                textBuilder += '<v-radio-group v-model="' + detailSchema.name + '" ';
                                textBuilder += ' :class="{'+"'input-group--hide-details'"+': '+(detailSchema.hasOwnProperty("hide_details") && detailSchema.hide_details)+', '+"'rating_process'"+': '+detailSchema.name+'loadingGroup }" ';
                                textBuilder += ' > ';
                            }

                            for (var key in detailSchema.items) {

                                if (detailSchema.hasOwnProperty("switch_right") && detailSchema.switch_right && !detailSchema.switch_inline) {
                                    cssClass += ' input-group--selection-controls__container__right ';
                                } else if (detailSchema.hasOwnProperty("switch_right") && detailSchema.switch_right && detailSchema.type == 'checkbox') {
                                    cssClass += ' input-group--selection-controls__container__right ';
                                }

                                if(detailSchema.type === 'checkbox'){
                                    textBuilder += '<v-checkbox ';
                                    textBuilder += ' v-model='+"'"+detailSchema.name+"'"+' ';
                                    textBuilder += ' :class="{'+"'rating_process'"+': '+detailSchema.name+'loadingGroup }" ';
                                } else if(detailSchema.type === 'radio'){
                                    textBuilder += '<v-radio ';
                                } else {
                                    textBuilder += '<v-switch ';
                                    textBuilder += ' v-model='+"'"+detailSchema.name+"'"+' ';
                                    textBuilder += ' :class="{'+"'rating_process'"+': '+detailSchema.name+'loadingGroup }" ';
                                }

                                if (detailSchema.hasOwnProperty("hide_details") && detailSchema.hide_details){
                                    textBuilder += ' hide-details ';
                                }

                                textBuilder += ' class='+"'"+cssClass+"'"+' ';

                                textBuilder += ' color=' + "'" + detailSchema.items[key].color + "'" + ' ';

                                textBuilder += ' value=' + "'" + detailSchema.items[key].value + "'" + ' ';

                                textBuilder += ' label=' + "'" + detailSchema.items[key].label + "'" + ' ';

                                if (detailSchema.hasOwnProperty("tabindex")) {
                                    textBuilder += ' tabindex=' + "'" + detailSchema.tabindex + "'" + ' ';
                                }

                                if (detailSchema.hasOwnProperty("append_icon")) {
                                    textBuilder += ' append-icon="' + detailSchema.append_icon + '" ';
                                }

                                if (detailSchema.hasOwnProperty("prepend_icon")) {
                                    textBuilder += ' prepend-icon="' + detailSchema.prepend_icon + '" ';
                                }

                                if (detailSchema.hasOwnProperty("dark") && detailSchema.dark) {
                                    
                                    textBuilder += ' dark ';
                                    
                                }
            
                                if (detailSchema.hasOwnProperty("light") && detailSchema.light) {
                                    
                                    textBuilder += ' light ';
                                    
                                }
                                
                                if(detailSchema.type === 'radio' && detailSchema.hasOwnProperty("onChange") ){
                                    eventSwitchBuilder = ' v-on:click.native=' + detailSchema.onChange;
                                } else if ( detailSchema.type != 'radio' && detailSchema.hasOwnProperty("onChange") ) {
                                    eventSwitchBuilder = ' @change=' + detailSchema.onChange;
                                }

                                if (detailSchema.hasOwnProperty('updateapi') && !(detailSchema.hasOwnProperty('mode') && detailSchema.mode)) {
                                    dataResult[detailSchema.name+"updateapi"] = [detailSchema.updateapi];
                                    if(detailSchema.type === 'radio'){
                                        textBuilder += ' v-on:click.native="'+detailSchema.name+"UpdateAPIFnc"+'" ';
                                    } else if ( detailSchema.type != 'radio') {
                                        textBuilder += ' @change="'+detailSchema.name+"UpdateAPIFnc"+'" ';
                                    }
                                }

                                if(detailSchema.type === 'checkbox'){
                                    textBuilder += ' ' + eventSwitchBuilder + ' hide-details ></v-checkbox> ';
                                } else if(detailSchema.type === 'radio'){
                                    textBuilder += ' ' + eventSwitchBuilder + ' hide-details ></v-radio> ';
                                } else {
                                    textBuilder += ' ' + eventSwitchBuilder + ' hide-details ></v-switch> ';
                                }

                            }

                            if(detailSchema.type === 'radio'){
                                textBuilder += '</v-radio-group>';
                            }

                        }

                        if(!detailSchema.hasOwnProperty("mode")){
                            textBuilder += ' </div> ';
                        }
                        
                        textBuilder += ' </div> ';
                        
                    } else {
                        var switch_inline = '';

                        if (detailSchema.hasOwnProperty("switch_inline") && detailSchema.switch_inline) {
                            switch_inline += ' input-group--switch_inline ';
                        }

                        if (detailSchema.hasOwnProperty("items")) {

                            dataResult[detailSchema.name + 'Items'] = detailSchema.items;
                            dataResult[detailSchema.name + 'loadingGroup'] = false;
                            var cssClass = '';

                            if (detailSchema.hasOwnProperty("cssClass")) {
                                cssClass += detailSchema.cssClass;
                            }

                            if (detailSchema.type === 'radio') {
                                textBuilder += '<v-radio-group v-model="' + detailSchema.name + '" ';
                                textBuilder += ' :class="{' + "'input-group--hide-details'" + ': ' + (detailSchema.hasOwnProperty("hide_details") && detailSchema.hide_details) + ', ' + "'rating_process'" + ': ' + detailSchema.name + 'loadingGroup }" ';
                                textBuilder += ' > ';
                            }

                            for (var key in detailSchema.items) {

                                if (detailSchema.hasOwnProperty("switch_right") && detailSchema.switch_right && !detailSchema.switch_inline) {
                                    cssClass += ' input-group--selection-controls__container__right ';
                                } else if (detailSchema.hasOwnProperty("switch_right") && detailSchema.switch_right && detailSchema.type == 'checkbox') {
                                    cssClass += ' input-group--selection-controls__container__right ';
                                }

                                if (detailSchema.type === 'checkbox') {
                                    textBuilder += '<v-checkbox ';
                                    textBuilder += ' v-model=' + "'" + detailSchema.name + "'" + ' ';
                                    textBuilder += ' :class="{' + "'rating_process'" + ': ' + detailSchema.name + 'loadingGroup }" ';
                                } else if (detailSchema.type === 'radio') {
                                    textBuilder += '<v-radio ';
                                } else {
                                    textBuilder += '<v-switch ';
                                    textBuilder += ' v-model=' + "'" + detailSchema.name + "'" + ' ';
                                    textBuilder += ' :class="{' + "'rating_process'" + ': ' + detailSchema.name + 'loadingGroup }" ';
                                }

                                if (detailSchema.hasOwnProperty("hide_details") && detailSchema.hide_details) {
                                    textBuilder += ' hide-details ';
                                }

                                textBuilder += ' class=' + "'" + cssClass + "'" + ' ';

                                textBuilder += ' color=' + "'" + detailSchema.items[key].color + "'" + ' ';

                                textBuilder += ' value=' + "'" + detailSchema.items[key].value + "'" + ' ';

                                textBuilder += ' label=' + "'" + detailSchema.items[key].label + "'" + ' ';

                                if (detailSchema.hasOwnProperty("tabindex")) {
                                    textBuilder += ' tabindex=' + "'" + detailSchema.tabindex + "'" + ' ';
                                }

                                if (detailSchema.hasOwnProperty("append_icon")) {
                                    textBuilder += ' append-icon="' + detailSchema.append_icon + '" ';
                                }

                                if (detailSchema.hasOwnProperty("prepend_icon")) {
                                    textBuilder += ' prepend-icon="' + detailSchema.prepend_icon + '" ';
                                }

                                if (detailSchema.hasOwnProperty("dark") && detailSchema.dark) {

                                    textBuilder += ' dark ';

                                }

                                if (detailSchema.hasOwnProperty("light") && detailSchema.light) {

                                    textBuilder += ' light ';

                                }

                                if (detailSchema.type === 'radio' && detailSchema.hasOwnProperty("onChange")) {
                                    eventSwitchBuilder = ' v-on:click.native=' + detailSchema.onChange;
                                } else if (detailSchema.type != 'radio' && detailSchema.hasOwnProperty("onChange")) {
                                    eventSwitchBuilder = ' @change=' + detailSchema.onChange;
                                }

                                if (detailSchema.hasOwnProperty('updateapi') && !(detailSchema.hasOwnProperty('mode') && detailSchema.mode)) {
                                    dataResult[detailSchema.name + "updateapi"] = [detailSchema.updateapi];
                                    if (detailSchema.type === 'radio') {
                                        textBuilder += ' v-on:click.native="' + detailSchema.name + "UpdateAPIFnc" + '" ';
                                    } else if (detailSchema.type != 'radio') {
                                        textBuilder += ' @change="' + detailSchema.name + "UpdateAPIFnc" + '" ';
                                    }
                                }

                                if (detailSchema.type === 'checkbox') {
                                    textBuilder += ' ' + eventSwitchBuilder + ' hide-details ></v-checkbox> ';
                                } else if (detailSchema.type === 'radio') {
                                    textBuilder += ' ' + eventSwitchBuilder + ' hide-details ></v-radio> ';
                                } else {
                                    textBuilder += ' ' + eventSwitchBuilder + ' hide-details ></v-switch> ';
                                }

                            }

                            if (detailSchema.type === 'radio') {
                                textBuilder += '</v-radio-group>';
                            }

                        }

                    }
                } else if(detailSchema.type === 'treeview'){

                    this.options.treeview = true;

                    dataResult[detailSchema.newdatatree] = {};
                    dataResult[detailSchema.datatree] = {};

                    textBuilder += '<vue-tree-list :model="'+detailSchema.datatree+'" folder_icon="'+detailSchema.folder_icon+'" ';

                    if(detailSchema.hasOwnProperty("toggle_item")){
                        textBuilder += ' @toggle-item="'+detailSchema.toggle_item+'" ';
                    }

                    textBuilder += ' ></vue-tree-list>';
                } else if(detailSchema.type === 'dialog'){
                    
                    

                    dataResult[this.options.el + 'Title'] = 'Thêm mới, cập nhật thông tin.';

                    var dialogType = 'fullscreen';

                    if(detailSchema.hasOwnProperty("type_dialog")){
                        dialogType = detailSchema.type_dialog;
                    }

                    textBuilder += ' <v-dialog v-model="'+detailSchema.name + '" '+dialogType+' transition="fade-transition" :overlay=false> <v-card> ';

                    textBuilder += ' <v-toolbar dark ';

                    if (detailSchema.hasOwnProperty("color")) {
                        textBuilder += 'color="primary"';
                    }

                    textBuilder += '>';

                    textBuilder += ' <v-btn icon @click.prevent.stop="'+detailSchema.name+'Close" dark :loading="'+detailSchema.name+'_hidden_loading" :disabled="'+detailSchema.name+'_hidden_loading" > <v-icon>close</v-icon> </v-btn> <v-toolbar-title>{{'+this.options.el+'Title}}</v-toolbar-title><v-spacer></v-spacer><v-toolbar-items>';

                    textBuilder += ' <v-btn dark flat @click.prevent.stop="'+detailSchema.name+'Save" :loading="'+detailSchema.name+'_hidden_loading" :disabled="'+detailSchema.name+'_hidden_loading" > <v-icon>'+detailSchema.icon_save+'</v-icon> &nbsp; '+detailSchema.label_save+'</v-btn> </v-toolbar-items> </v-toolbar> ';

                    if (this.options.template === "default"){
                        var dialogtemplate = document.getElementById(detailSchema.template);
                        dialogtemplate.className = "";
                        textBuilder += dialogtemplate.innerHTML;
                    } else {
                        textBuilder += detailSchema.template;
                    }
                    

                    textBuilder += ' </v-card> </v-dialog>';

                    if(dialogtemplate != null){
                        dialogtemplate.remove();
                    }
                } else  if(detailSchema.type === 'dialogsm'){
                    
                    

                    dataResult[this.options.el + 'Title'] = 'Thêm mới, cập nhật thông tin.';

                    textBuilder += ' <v-dialog max-width="901" v-model="'+detailSchema.name + '" persistent transition="fade-transition" :overlay=false> <v-card> ';

                    textBuilder += ' <div class="card__title px-0 py-0" style="background-color: rgb(214, 233, 247);min-height: 43px;position: fixed;max-width: 900px;width: 100%;z-index: 9999;"><span class="pl-3">{{'+this.options.el+'Title}}</span><v-spacer></v-spacer><div class="menu" style="display: inline-block;"><div class="menu__activator"><v-btn icon slot="activator" @click.native="'+detailSchema.name + ' = false"><v-icon>close</v-icon></v-btn></div></div></div> ';

                    textBuilder += '<v-card-text>';

                    if (this.options.template === "default"){
                        var dialogtemplate = document.getElementById(detailSchema.template);
                        dialogtemplate.className = "";
                        textBuilder += dialogtemplate.innerHTML;
                    } else {
                        textBuilder += detailSchema.template;
                    }
                   
                    textBuilder += '</v-card-text> ';
                    
                    textBuilder += '<v-card-actions> <v-spacer></v-spacer>';

                    textBuilder += ' <v-btn flat @click.native="'+detailSchema.name+'Close"> <v-icon>close</v-icon> &nbsp; Quay lại </v-btn> ';
                    textBuilder += ' <v-btn flat @click.native="'+detailSchema.name+'Save" :loading="'+detailSchema.name+'_hidden_loading" :disabled="'+detailSchema.name+'_hidden_loading" > <v-icon>save</v-icon> &nbsp; Ghi lại</v-btn> ';

                    textBuilder += '</v-card-actions>';

                    textBuilder += ' </v-card> </v-dialog> ';

                    if(dialogtemplate != null){
                        dialogtemplate.remove();
                    }
                } else if(detailSchema.type === 'button'){
                    
                    dataResult[detailSchema.name+ 'show'] = true;

                    if(detailSchema.hasOwnProperty("show") && !detailSchema.show){
                        dataResult[detailSchema.name+ 'show'] = false;                        
                    }

                    textBuilder += ' <v-btn v-if="'+detailSchema.name+ 'show' +'" :loading="'+detailSchema.name+'_hidden_loading" :disabled="'+detailSchema.name+'_hidden_loading" color="'+detailSchema.color+'" class="'+detailSchema.cssClass+'" ';
                    
                    textBuilder += ' @click.stop.prevent="'+detailSchema.onClick+'" >';
                    if(detailSchema.hasOwnProperty("left_icon")){
                        textBuilder += ' <v-icon left dark >'+detailSchema.left_icon+'</v-icon> ';
                    }
                    
                    textBuilder += ' ' + detailSchema.label + ' ';
                    
                    if(detailSchema.hasOwnProperty("right_icon")){
                        textBuilder += ' <v-icon right dark >'+detailSchema.right_icon+'</v-icon> ';
                    }
                    textBuilder += ' </v-btn> ';
                } else if (detailSchema.type === 'navigation'){

                    dataResult[detailSchema.name+ 'view'] = true;

                    textBuilder += '<v-layout wrap> <v-scale-transition> <v-navigation-drawer v-if="'+detailSchema.name+'view" hide-overlay light v-model="'+detailSchema.name+'" class="'+detailSchema.cssClass+'" >';

                    if (this.options.template === "default"){
                        var navigationtemplate = document.getElementById(detailSchema.template);
                        navigationtemplate.className = "";
                        textBuilder += navigationtemplate.innerHTML;
                    } else {
                        textBuilder += detailSchema.template;
                    }

                    textBuilder += '</v-navigation-drawer> </v-scale-transition>';

                    textBuilder += '<v-layout class="view jx-content">';
                    textBuilder += '<v-scale-transition>';
                    textBuilder += '<v-btn @click.stop="'+detailSchema.name+' = !'+detailSchema.name+'" v-show="!'+detailSchema.name+'" light fixed top right fab> <v-icon>menu</v-icon> </v-btn>';
                    textBuilder += '</v-scale-transition>';
                    textBuilder += '<transition name="slide-x-transition">';
                      
                    if (this.options.template === "default"){
                        var contenttemplate = document.getElementById(detailSchema.template_content);
                        contenttemplate.className = "";
                        textBuilder += contenttemplate.innerHTML;
                    } else {
                        textBuilder += detailSchema.template_content;
                    }

                    textBuilder += '</transition> </v-layout>';

                    textBuilder += '</v-layout>';

                    if(navigationtemplate != null){
                        navigationtemplate.remove();
                    }
                    if(contenttemplate != null){
                        contenttemplate.remove();
                    }
                    
                } else if (detailSchema.type === 'listgroup'){
                    
                    dataResult[detailSchema.name+ 'selected'] = 0;
                    dataResult[detailSchema.name+ 'Items'] = [];
                    
                    textBuilder += '<v-list> <v-list-group v-for="(item, index) in '+detailSchema.name+'Items" :value="item.active || item.id === -1" v-bind:key="item.'+detailSchema.data_title+'" :class="{'+"'list--group__header--active': " + detailSchema.name+ 'selected == item.id}" >';

                    textBuilder += '<v-list-tile slot="item" @click="'+detailSchema.onClick+'(item)" >';

                    textBuilder += '<v-list-tile-action> <v-icon v-if="'+detailSchema.name+ 'selected'+' == item.id">{{ item.action_active }}</v-icon> <v-icon v-else>{{ item.action }}</v-icon> </v-list-tile-action>';

                    textBuilder += '<v-list-tile-content> <v-list-tile-title>{{ item.'+detailSchema.data_title+' }} </v-list-tile-title> <span class="status__counter" v-if="'+detailSchema.show_counter+'">{{ item.'+detailSchema.counter+' }}</span> </v-list-tile-content>';

                    textBuilder += '<v-list-tile-action> <v-icon class="mr-2">search</v-icon> </v-list-tile-action>';

                    textBuilder += '</v-list-tile>';

                    textBuilder += '<v-list-tile v-for="(subItem, subIndex) in item.'+detailSchema.child_items+'"  @click="'+detailSchema.onClick+'(subItem)" ' ;
                    
                    textBuilder += " :class="+'"'+"{'list--group__header--active':  subItem."+detailSchema.data_value+" == "+detailSchema.name+"selected} "+'"'+" ";

                    textBuilder += '>';

                    // textBuilder += '<v-list-tile-action> <v-icon>{{ subItem.action }}</v-icon> </v-list-tile-action>'; list--group__header--active

                    textBuilder += '<v-list-tile-action> <v-icon v-if="subItem.'+detailSchema.data_value+' == '+detailSchema.name+ 'selected" >play_arrow</v-icon> <v-icon v-else></v-icon> </v-list-tile-action>';

                    textBuilder += '<v-list-tile-content> <v-list-tile-title> {{ subItem.'+detailSchema.data_title+' }} </v-list-tile-title>  <span class="status__counter" v-if="'+detailSchema.show_counter+' && subItem.'+detailSchema.counter+' > -1">{{ subItem.'+detailSchema.counter+' }}</span> <span class="status__counter" v-else><v-progress-circular indeterminate color="red"></v-progress-circular></span></v-list-tile-content>';

                    textBuilder += '</v-list-tile>';

                    textBuilder += '</v-list-group> </v-list>';
                } else if (detailSchema.type === 'expansion'){
                    
                    dataResult[detailSchema.name+ 'Items'] = [];

                    textBuilder += ' <v-card> <v-expansion-panel ';

                    if(detailSchema.hasOwnProperty("expand") && detailSchema.expand){
                        textBuilder += ' expand '; 
                    }

                    textBuilder += ' ><v-expansion-panel-content ';

                    textBuilder += ' v-for="(item, index) in '+detailSchema.name+'Items" ';
                   

                    if(detailSchema.hasOwnProperty("expand") && detailSchema.expand){
                        textBuilder += ' v-bind:value="true" ';
                    }

                    textBuilder += '  > ';

                    if (this.options.template === "default"){
                        var contenttemplate = document.getElementById(detailSchema.template);
                        contenttemplate.className = "";
                        textBuilder += contenttemplate.innerHTML;
                    } else {
                        textBuilder += detailSchema.template;
                    }
                    
                    textBuilder += ' </v-expansion-panel-content></v-expansion-panel> </v-card> ';

                    if(contenttemplate != null){
                        contenttemplate.remove();
                    }

                } else if (detailSchema.type === 'expansionpanel'){
                    
                    dataResult[detailSchema.name+ 'Items'] = [];

                    textBuilder += ' <v-card> <v-expansion-panel ';

                    if(detailSchema.hasOwnProperty("expand") && detailSchema.expand){
                        textBuilder += ' expand '; 
                    }

                    textBuilder += ' ><v-expansion-panel-content class="jx-panel" ';
                    
                    if(detailSchema.hasOwnProperty("expand") && detailSchema.expand){
                        textBuilder += ' v-bind:value="true" ';
                    }

                    textBuilder += ' > ';

                    textBuilder += '<div slot="header" class="'+detailSchema.cssClass+'">'+detailSchema.label+'</div>';
                    
                    textBuilder += ' <div v-for="(item, index) in '+detailSchema.name+'Items" >';
                    
                    if (this.options.template === "default"){
                        var contenttemplate = document.getElementById(detailSchema.template);
                        contenttemplate.className = "";
                        textBuilder += contenttemplate.innerHTML;
                    } else {
                        textBuilder += detailSchema.template;
                    }
                    
                    textBuilder += ' </div> ';

                    textBuilder += ' </v-expansion-panel-content></v-expansion-panel> </v-card> ';

                    if(contenttemplate != null){
                        contenttemplate.remove();
                    }

                } else if (detailSchema.type === 'listview'){
                    
                    dataResult[detailSchema.name+ 'Items'] = [];

                    textBuilder += ' <v-card> ';

                    
                    textBuilder += ' <div v-for="(item, index) in '+detailSchema.name+'Items" >';
                    
                    if (this.options.template === "default"){
                        var contenttemplate = document.getElementById(detailSchema.template);
                        contenttemplate.className = "";
                        textBuilder += contenttemplate.innerHTML;
                    } else {
                        textBuilder += detailSchema.template;
                    }
                    
                    textBuilder += ' </div> ';

                    textBuilder += ' </v-card> ';

                    if(contenttemplate != null){
                        contenttemplate.remove();
                    }

                } else if (detailSchema.type === 'table'){
                    
                    dataResult[detailSchema.name+ 'Total'] = 0;
                    dataResult[detailSchema.name+ 'TotalCount'] = 0;
                    dataResult[detailSchema.name+ 'Items'] = [];
                    dataResult[detailSchema.name+ 'page'] = 1;
                    dataResult[detailSchema.name+ 'pagecustom'] = 1;
                    dataResult[detailSchema.name+ 'visible'] = 10;
                    dataResult[detailSchema.name+ 'selected'] = [];
                    dataResult[detailSchema.name+ 'headers'] = [];
                    dataResult[detailSchema.name+ 'show'] = true;

                    textBuilder += ' <v-data-table ';

                    textBuilder += ' v-bind:headers="'+detailSchema.name+ 'headers'+'" ';
                    
                    textBuilder += ' v-bind:items="'+detailSchema.name+ 'Items'+'" ';
                    
                    textBuilder += ' v-model="'+detailSchema.name+ 'selected'+'" ';
					
                    textBuilder += ' item-key="'+detailSchema.item_key+'" ';

                    textBuilder += ' class="' +detailSchema.cssClass+ '" ';

                    textBuilder += ' hide-actions ';
                    
                    if(detailSchema.hasOwnProperty("select_all") && detailSchema.select_all){
                        textBuilder += ' select-all ';
                    }

                    if(detailSchema.hasOwnProperty("hide_headers") && detailSchema.hide_headers){
                        textBuilder += ' hide-headers ';
                    }
					
					if (detailSchema.hasOwnProperty("no_data_text")) {
                        
                        textBuilder += ' no-data-text='+"'"+detailSchema.no_data_text+"'"+' ';

                    }
                    
                    textBuilder += ' > ';

                    if (this.options.template === "default"){
                        var contenttemplate = document.getElementById(detailSchema.template);
                        contenttemplate.className = "";
                        textBuilder += contenttemplate.innerHTML.replace(/<table>/g , "")
                        .replace(/<tbody>/g , "")
                        .replace(/<tr>/g , "")
                        .replace(/<\/tr>/g , "")
                        .replace(/<\/tbody>/g , "")
                        .replace(/<\/table>/g , "");

                    } else {
                        textBuilder += detailSchema.template;
                    }


                    textBuilder += ' </v-data-table> ';

                    if(contenttemplate != null){
                        contenttemplate.remove();
                    }

                    //pagging
                    textBuilder += ' <div class="text-xs-right layout wrap" style="position: relative;"> ';
                    textBuilder += ' <div class="flex pagging-table"> <tiny-pagination :total="'+detailSchema.name+ 'TotalCount'+'" :page="'+detailSchema.name+ 'page'+'" custom-class="custom-tiny-class" @tiny:change-page="'+detailSchema.paggingcustom+ ''+'" ></tiny-pagination> </div>';
                    textBuilder += ' </div> ';
                }
                
                //jx-bind template
                var templateElStage = document.querySelector('[jx-bind="'+detailSchema.name+'"]');

                if (detailSchema.type === 'date') {
                    
                    methodsBuilder = eval('( { '+
                        'formatDate'+detailSchema.name+' (date) { '+
                            ' if (!date) { return null } '+
                            ' const [year, month, day] = date.split('+"'-'"+'); '+
                            ' return `${day}/${month}/${year}`; '+
                        '}, '+
                        ' parseDate'+detailSchema.name+' (date) { '+
                            ' if (!date) { return null } '+
                            ' const [day, month, year] = date.split('+"'/'"+'); '+
                            ' return `${year}-${month.padStart(2, "0")}-${day.padStart(2, "0")}`; '+
                        '}, '+
                    '} )');
                                               
                }
                if (detailSchema.hasOwnProperty("tags") && detailSchema.tags) {
                    
                    methodsBuilder = eval('( { '+
                            detailSchema.name+'InputEvent: function () { '+
                            ' var data = this.'+detailSchema.name+'; '+
                            ' for(var key in data){ '+
                            ' if((typeof data[key] == "string" && data[key].length > 0)){ '+
                                ' this.'+detailSchema.name+'.push({ "'+detailSchema.item_text+'": data[key], "'+detailSchema.item_value+'": data[key] }); '+
                            ' } '+
                            ' } '+
                            ' i = this.'+detailSchema.name+'.length; '+
                            ' while (i--) { if (typeof this.'+detailSchema.name+'[i] === "string") { this.'+detailSchema.name+'.splice(i, 1); } } '+
                        '} '+
                    '} )');
                                               
                }
                
                if (detailSchema.hasOwnProperty("mode")) {

                    

                    if (detailSchema.type !== 'select'){
                        textBuilder += ' </div> </div> <v-fade-transition>';

                        textBuilder += '</v-fade-transition>';
                    } else {
	                     textBuilder += ' </div></div> ';
                    }
                    
                    textBuilder += '<div class="editable-tool" v-if="'+detailSchema.name+'permission === '+"'write'" +' || '+detailSchema.name+'permission === '+"'owner'" +' "> <v-fade-transition> ';

                    textBuilder += '<v-btn flat icon class="btn--editable btn--editable--done mx-0 my-0" v-if="!'+detailSchema.name+'_hidden"  @click.stop.prevent="'+detailSchema.name+'UpdateEvent" :loading="'+detailSchema.name+'_hidden_loading" :disabled="'+detailSchema.name+'_hidden_loading" > <v-icon>done</v-icon></v-btn></v-fade-transition> ';
                    
                    textBuilder += '<v-btn flat icon class="btn--editable btn--editable--done mx-0 my-0" @click.stop.prevent="'+detailSchema.name+'TempleDataEvent" v-if="'+detailSchema.name+'_hidden"> <v-icon v-if="'+detailSchema.name+'_hidden">create</v-icon> </v-btn>';
                    textBuilder += '<v-btn flat icon class="mx-0 my-0" @click.stop.prevent="'+detailSchema.name+'RolbackEvent" v-if="!'+detailSchema.name+'_hidden"> <v-icon v-if="!'+detailSchema.name+'_hidden" color="red darken-3">clear</v-icon> </v-btn>';
                    
                    textBuilder += '</div> ';
                    
                    var apiSubmitBuilder = ' var vm = this ; var validator = document.querySelector(".editable-wrap .error--text"); ';
					
					if (detailSchema.type === 'select'){
                        apiSubmitBuilder += ' var dataToAPI = new URLSearchParams(); dataToAPI.append("'+detailSchema.name+'", this.'+detailSchema.name+'.'+detailSchema.item_value+'); if (this.'+detailSchema.name+'.'+detailSchema.item_value+' == "undefined") { validator = "error"; } ';
                    } else if (detailSchema.type === 'date'){
                        apiSubmitBuilder += ' var dataToAPI = new URLSearchParams(); const [day, month, year] = vm.'+detailSchema.name+'.split("/"); var dateData = year +""+ month +""+ day; dataToAPI.append("'+detailSchema.name+'", dateData);  if (dateData == "undefined") { validator = "error"; }';
                    } else {
                        apiSubmitBuilder += ' var dataToAPI = new URLSearchParams(); dataToAPI.append("'+detailSchema.name+'", this.'+detailSchema.name+'); ';
                    }

                    apiSubmitBuilder += ' if(validator == null) {var idTEMPX = vm.'+detailSchema.name+'pk ; console.log(idTEMPX); vm.'+detailSchema.name+'_hidden_loading = true; const config = { headers: { "groupId": '+this.options.groupid+' } }; axios.put("'+detailSchema.updateapi+'/" + idTEMPX, dataToAPI, config).then(function (response) { vm.snackbar'+this.options.el+' = true; vm.'+detailSchema.name+'_hidden = !vm.'+detailSchema.name+'_hidden ;  vm.'+detailSchema.name+'_hidden_loading = false; vm.snackbartext'+this.options.el+'="'+detailSchema.success_msg+'" ;';
                    
                    if (detailSchema.hasOwnProperty("call_back_success")){
                        apiSubmitBuilder += ' vm.'+detailSchema.call_back_success+'(response); ';
                    }

                    apiSubmitBuilder += '}) .catch(function (error) { ';

                    apiSubmitBuilder += ' vm.snackbareror'+this.options.el+' = true; vm.'+detailSchema.name+'_hidden_loading = false; vm.snackbartext'+this.options.el+'="'+detailSchema.error_msg+'" ; ';
                    
                    if (detailSchema.hasOwnProperty("call_back_error")){
                        apiSubmitBuilder += ' vm.'+detailSchema.call_back_error+'(error); ';
                    }

                    apiSubmitBuilder += ' }) }  ';

                    var rolbackEventBuilder = detailSchema.name+'RolbackEvent () { this.'+detailSchema.name+'_hidden = !this.'+detailSchema.name+'_hidden ; this.'+detailSchema.name+' = this.'+detailSchema.name+'_tempData;}, ';
                    if (detailSchema.type === 'select'){
                        rolbackEventBuilder = detailSchema.name+'RolbackEvent () { this.'+detailSchema.name+'_hidden = !this.'+detailSchema.name+'_hidden ; this.'+detailSchema.name+' = this.'+detailSchema.name+'_tempData;}, ';
                    }

                    var editableMethodsBuilder = eval('( { '+
                        detailSchema.name+'TempleDataEvent () { this.'+detailSchema.name+'_tempData = this.'+detailSchema.name+'; this.'+detailSchema.name+'_hidden = !this.'+detailSchema.name+'_hidden ; }, '+
                        rolbackEventBuilder +
                        detailSchema.name+'UpdateEvent () { '+apiSubmitBuilder+' }, '+
                    '} )');

                    for (var key in editableMethodsBuilder) {
                        if (editableMethodsBuilder.hasOwnProperty(key)) {
                            methodsBuilder[key] = editableMethodsBuilder[key];
                        }
                    }

                }

                if ((detailSchema.type === 'slider' || detailSchema.type === 'radio' || detailSchema.type === 'checkbox' || detailSchema.type === 'switch') && detailSchema.hasOwnProperty('updateapi') && !(detailSchema.hasOwnProperty("mode") && detailSchema.mode)){

                    var apiSliderSubmitBuilder = ' var vm = this ; vm.'+detailSchema.name+'loadingGroup = true; ';

                    apiSliderSubmitBuilder += ' var dataToAPI = { ' + detailSchema.name + ': this.' + detailSchema.name + ' }; ';

                    if (detailSchema.type === 'slider') {
                        apiSliderSubmitBuilder += ' if (vm.'+detailSchema.name+' > 0) { ';
                    }
                    apiSliderSubmitBuilder += ' const config = { headers: { "groupId": ' + this.options.groupid + ' } }; var idTEMPX = vm.'+detailSchema.name+'pk ; axios.put("' + detailSchema.updateapi + '/" + idTEMPX, dataToAPI, config).then(function (response) { vm.snackbar' + this.options.el + ' = true; vm.snackbartext' + this.options.el + '="' + detailSchema.success_msg + '" ;';

                    if (detailSchema.hasOwnProperty("call_back_success")) {
                        apiSliderSubmitBuilder += ' vm.' + detailSchema.call_back_success + '(response); ';
                    }

                    apiSliderSubmitBuilder += '}) .catch(function (error) { ';

                    apiSliderSubmitBuilder += ' vm.snackbareror' + this.options.el + ' = true; vm.snackbartext' + this.options.el + '="' + detailSchema.error_msg + '" ; ';

                    if (detailSchema.hasOwnProperty("call_back_error")) {
                        apiSliderSubmitBuilder += ' vm.' + detailSchema.call_back_error + '(error); ';
                    }

                    apiSliderSubmitBuilder += ' }); setTimeout(function () { vm.'+detailSchema.name+'loadingGroup = false }, 500) ';
                    if (detailSchema.type === 'slider') {
                        apiSliderSubmitBuilder += ' } ';
                    }
                    var sliderMethodsBuilder = eval('( { ' +
                        detailSchema.name + 'UpdateAPIFnc () { ' + apiSliderSubmitBuilder + ' }, ' +
                        '} )');

                    for (var key in sliderMethodsBuilder) {
                        if (sliderMethodsBuilder.hasOwnProperty(key)) {
                            methodsBuilder[key] = sliderMethodsBuilder[key];
                        }
                    }
                }

                if (templateElStage != null) {
                    templateElStage.innerHTML = textBuilder;
                } else {
                    elDOM.innerHTML += textBuilder;
                }

                if (detailSchema.hasOwnProperty("events")){
                    
                    var eventJX = detailSchema.events;

                    for (var key in eventJX) {
                        if (eventJX.hasOwnProperty(key)) {
                            methodsBuilder[key] = eventJX[key];
                        }
                    }
                    
                }

                //bind data 
                for (var key in computedBuilder) {
                    if (computedBuilder.hasOwnProperty(key)) {
                        computedBuilderG[key] = computedBuilder[key];
                    }
                }
                for (var key in watchBuilder) {
                    if (watchBuilder.hasOwnProperty(key)) {
                        watchBuilderG[key] = watchBuilder[key];
                    }
                }
                for (var key in methodsBuilder) {
                    if (methodsBuilder.hasOwnProperty(key)) {
                        methodsBuilderG[key] = methodsBuilder[key];
                    }
                }
                
                if ( detailSchema.hasOwnProperty("onLoad") ) {
                    mountedG += ' this.' + detailSchema.onLoad+'(); ';
                }
                
            }

            var snackbarBuiler = ' ';
            snackbarBuiler += ' <v-snackbar :timeout="2000" :top="true" :bottom="false" :right="true" :left="false" :multi-line="true" :vertical="false" v-model="snackbar'+this.options.el+'" class="snackbar-success" > ';
            snackbarBuiler += ' <v-icon flat color="white">check_circle</v-icon> {{ snackbartext'+this.options.el+' }} <v-btn flat fab mini color="white" @click.native="snackbar'+this.options.el+' = false">Tắt</v-btn> </v-snackbar> ';

            snackbarBuiler += ' <v-snackbar :timeout="2000" :top="true" :bottom="false" :right="false" :left="false" :multi-line="true" :vertical="false" v-model="snackbareror'+this.options.el+'" class="snackbar-error" > ';
            snackbarBuiler += ' <v-icon flat color="white">check_circle</v-icon> {{ snackbartext'+this.options.el+' }} <v-btn flat fab mini color="white" @click.native="snackbareror'+this.options.el+' = false">Tắt</v-btn> </v-snackbar> ';

            dataResult['snackbar'+this.options.el] = false;
            dataResult['snackbareror'+this.options.el] = false;
            dataResult['snackbartext'+this.options.el] = "Error!";

            elDOM.innerHTML += snackbarBuiler + '</v-app>';

            this.options.data = dataResult;
            this.options.computed = computedBuilderG;
            this.options.watch = watchBuilderG;
            this.options.methods = methodsBuilderG;
            this.options.mountedG = eval('( function () { this.$nextTick(function () { ' + mountedG + ' } ) } )');
            
        },

        _builder: function (form) {
            
            var componentsBuilder = {};

            if(this.options.treeview){
                componentsBuilder = {
                    'VueTreeList': VueTreeList.VueTreeList
                }
            }
            
            form = new Vue({
                el: '#' + this.options.el,
                data: this.options.data,
                components: componentsBuilder,
                computed: this.options.computed,
                watch: this.options.watch,
                methods: this.options.methods,
                mounted: this.options.mountedG
            });

        }

    };

}());

Vue.filter('date', function(value) {
    if (value) {
      var dateCur = new Date(value);
      var month = dateCur.getMonth() + 1;
      var day = dateCur.getDate() ;
      var year = dateCur.getFullYear();
      if (day < 10) {
        day = '0' + day;
      }
      if (month < 10) {
        month = '0' + month;
      }
      return day + "/" + month + "/" + year;
    } else {
      return "Chưa cập nhật"
    }
});

Vue.filter('datetime', function(value) {
    if (value) {
      var dateCur = new Date(value);
      var month = dateCur.getMonth() + 1;
      var day = dateCur.getDate() ;
      var year = dateCur.getFullYear();
      var hour = dateCur.getHours();
      var minute = dateCur.getMinutes();
      var seconds = dateCur.getSeconds();
      if (day < 10) {
        day = '0' + day;
      }
      if (month < 10) {
        month = '0' + month;
      }
      if (hour < 10) {
        hour = '0' + hour;
      }
      if (minute < 10) {
        minute = '0' + minute;
      }
      if (seconds < 10) {
        seconds = '0' + seconds;
      }
      return day + "/" + month + "/" + year + " " + hour + ":" + minute + ":" + seconds;
    } else {
      return "Chưa cập nhật"
    }
});

Vue.filter('datetimelog', function(value) {
    if (value) {
      var dateCur = new Date(value);
      var month = dateCur.getMonth() + 1;
      var day = dateCur.getDate() ;
      var year = dateCur.getFullYear();
      var hour = dateCur.getHours();
      var minute = dateCur.getMinutes();
      var seconds = dateCur.getSeconds();
      if (day < 10) {
        day = '0' + day;
      }
      if (month < 10) {
        month = '0' + month;
      }
      if (hour < 10) {
        hour = '0' + hour;
      }
      if (minute < 10) {
        minute = '0' + minute;
      }
      if (seconds < 10) {
        seconds = '0' + seconds;
      }
      return hour + ":" + minute + ":" + seconds + ' | ' + day + "/" + month + "/" + year;
    } else {
      return "Chưa cập nhật"
    }
});

Vue.filter('money', function(value) {
    if (value) {
      var moneyCur = (value/1).toFixed(3);
      
      return moneyCur.toString().replace(/\B(?=(\d{3})+(?!\d))/g, " ");
    } else {
      return "0"
    }
});

Vue.filter('paymentStatusLabel', function(value) {
    if (value === 0) {
    	return "Chờ nộp";
    } else if (value === 1) {
    	return "Chờ xác nhận";
    } else if (value === 2) {
    	return "Hoàn thành";
    } else if (value === 3) {
    	return "không hợp lệ";
    }
});

Vue.filter('paymentStatusAction', function(value) {
	if (value === 0) {
    	return "Thu phí";
    } else if (value === 1) {
    	return "Xác nhận";
    }
});

Vue.filter('registrationState', function(value) {
	if (value === 0) {
    	return "Doanh nghiệp đăng ký thông tin";
    } else if (value === 1) {
    	return "Chờ phê duyệt";
    } else if (value === 2) {
    	return "Đã xác nhận đăng ký";
    } else if (value === 3) {
    	return "Yêu cầu bổ sung";
    }
});

Vue.filter('hhstatelabel', function(value) {
    if (value === 11) {
    	return "Chờ tiếp nhận";
    } else if (value === 14) {
    	return "Chờ cấp KH điều động";
    } else if (value === 15) {
    	return "Đã cấp KH điều động";
    } else if (value === 16) {
    	return "Đã hủy KH điều động";
    } else if (value === 12) {
    	return "Đã tiếp nhận";
    } else if (value === 13) {
    	return "Từ chối tiếp nhận";
    } else if (value === 27) {
    	return "Yêu cầu sửa đổi bổ sung";
    } else if (value === 114) {
    	return "Chờ sửa KH điều động";
    }
});
Vue.filter('hhstatelabeltt', function(value) {
    if (value === 12) {
    	return "Chờ phê duyệt hoàn thành thủ tục";
    } else if (value === 13) {
    	return "Yêu cầu sửa đổi bổ sung";
    } else if (value === 18) {
    	return "Đã tiếp nhận";
    } else if (value === 19) {
    	return "Phê duyệt hoàn thành thủ tục";
    } else if (value === 10) {
    	return "Hủy thủ tục";
    } else if (value === 20) {
    	return "Đề nghị cấp giấy phép";
    } else if (value === 120) {
    	return "Đề nghị sửa giấy phép";
    } else if (value === 25) {
    	return "Tạm dừng làm thủ tục điện tử";
    }
});
Vue.mixin({
  methods: {
    customeDateStr: function (dateStr) {
	    if (dateStr) {
		    var dateCur = new Date(dateStr);
			var month = dateCur.getMonth() + 1;
			var day = dateCur.getDate();
			var year = dateCur.getFullYear();
			if (day < 10) {
				day = '0' + day;
			}
			if (month < 10) {
				month = '0' + month;
			}
			return day + "/" + month + "/" + year;
		} else {
	      return ""
	    }
    },
    initEditableControl: function (components, data, classPK, permission, vm) {
	    setTimeout(
		    function() {
			
			for (var key in components) {
				var component = components[key];
				
				if (component.type !== 'date') {
					vm[component.name] = data[component.value];
				} else {
					var dateStr = data[component.value];
					if (dateStr) {
					    var dateCur = new Date(dateStr);
						var month = dateCur.getMonth() + 1;
						var day = dateCur.getDate();
						var year = dateCur.getFullYear();
						if (day < 10) {
							day = '0' + day;
						}
						if (month < 10) {
							month = '0' + month;
						}
						vm[component.name] = day + "/" + month + "/" + year;
					} else {
				      vm[component.name] = "";
				    }
				}
				vm[component.name + "pk"] = classPK;
				if (permission) {
					vm[component.name + "permission"] = permission;
				} else {
					vm[component.name + "permission"] = 'read';
				}
	   		}
			
		},
		50);
    }
  }
})