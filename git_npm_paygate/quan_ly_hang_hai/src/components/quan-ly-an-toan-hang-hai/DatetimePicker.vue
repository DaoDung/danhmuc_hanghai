<template>
    <div class="input-group date" style="border-bottom: 1px solid #949494; position: relative;">
        <masked-input v-model="value" mask="11/11/1111 11:11" @change="handlerChange()" @keyup.enter="handlerKeyUpEnter()" @input="selectStringToDate(value)" />
        <!-- <v-text-field
          v-model="value" mask="11/11/1111 11:11" @keyup.enter="handlerKeyUpEnter()" @input="selectStringToDate(value)"
          class="my-0 py-0"
        ></v-text-field> -->
        <i class="mdi mdi-calendar" size="16" @click="toggleDisplay"
        style="
            position: absolute;
            right: 8px !important;
            top: -5px !important;
            font-size: 20px !important;
            cursor: pointer;
            color: #726666;
        "></i>
        <div v-show="showMyself" class="bootstrap-datetimepicker-widget dropdown-menu">
            <ul style="padding: 0px;z-index: 20;">
                <li>
                    <div class="datepicker">
                        <div class="datepicker-days">
                            <table class="table-condensed">
                                <thead>
                                <tr>
                                    <th class="prev" @click.stop="goPrev" @keydown.left="goPrev">&#8249;</th>
                                    <th colspan="5" class="text-center">{{ getTitle(currentMonth) }}</th>
                                    <th class="next" @click.stop="goNext" @keydown.right="goNext">›</th>
                                </tr>
                                <tr>
                                    <th class="dow"
                                        v-for="(dayIndex, index) in 7" v-bind:key="index">
                                        {{ (dayIndex - 1) | localeWeekDay(firstDay, locale) }}
                                    </th>
                                </tr>
                                </thead>
                                <tbody>
                                <tr v-for="(week, index) in weeks" v-bind:key="index">
                                    <td v-for="(day, indexDay) in week" v-bind:key="indexDay"
                                        :class="['day',
                                            day.isSelected? 'active': null,
                                            day.isToday? 'today': null,
                                            !day.isCurrentMonth? 'not-present': null]"
                                        @click="selectDate(day.date)"
                                    >{{ (showDst && day.date.isDST()?'*':'') + day.date.format('D') }}</td>
                                </tr>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </li>
                <li>
                    <div class="timepicker">
                        <div class="timepicker-picker">
                            <table class="table-condensed">
                                <tbody>
                                <tr>
                                    <td v-if="showHours">
                                        <a href="#" class="btn" @click.prevent="incrementHours">&#x25B2;</a>
                                    </td>
                                    <td v-if="showHours" class="separator"></td>
                                    <td v-if="showMinutes">
                                        <a href="#" class="btn" @click.prevent="incrementMinutes">&#x25B2;</a>
                                    </td>
                                    <td v-if="showSeconds" class="separator"></td>
                                    <td v-if="showSeconds">
                                        <a href="#" class="btn" @click.prevent="incrementSeconds">&#x25B2;</a>
                                    </td>
                                </tr>
                                <tr>
                                    <td v-if="showHours">
                                      <v-menu open-on-hover top offset-y>
                                        <span class="timepicker-hour" slot="activator">{{' '+selectedDateTimeObject.format('HH')}} : giờ</span>
                                        <v-list>
                                          <v-list-tile v-for="n in 24" :key="n" @click.prevent="selectChangeHours(n)">
                                            <v-list-tile-title>{{ n }} : giờ</v-list-tile-title>
                                          </v-list-tile>
                                        </v-list>
                                      </v-menu>
                                    </td>
                                    <td v-if="showHours" class="separator">:</td>
                                    <td v-if="showMinutes">
                                      <v-menu open-on-hover top offset-y>
                                        <span class="timepicker-minute" slot="activator">{{' '+selectedDateTimeObject.format('mm')}} : phút</span>
                                        <v-list>
                                          <v-list-tile v-for="n in minuteArray" :key="n" @click.prevent="selectChangeMinutes(n)">
                                            <v-list-tile-title>{{ n }} : phút</v-list-tile-title>
                                          </v-list-tile>
                                        </v-list>
                                      </v-menu>
                                    </td>
                                    <td v-if="showSeconds" class="separator">:</td>
                                    <td v-if="showSeconds">
                                        <span class="timepicker-second">Sec:{{' '+selectedDateTimeObject.format('ss')}}</span>
                                    </td>
                                </tr>
                                <tr>
                                    <td v-if="showHours">
                                        <a href="#" class="btn" @click.prevent="decrementHours">&#x25BC;</a>
                                    </td>
                                    <td v-if="showHours" @click.prevent="showMyself = false" class="separator red--text text--darken-3" style="cursor: pointer;">Ok</td>
                                    <td v-if="showMinutes">
                                        <a href="#" class="btn" @click.prevent="decrementMinutes">&#x25BC;</a>
                                    </td>
                                    <td v-if="showSeconds" class="separator"></td>
                                    <td v-if="showSeconds">
                                        <a href="#" class="btn" @click.prevent="decrementSeconds">&#x25BC;</a>
                                    </td>
                                </tr>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </li>
            </ul>
        </div>
    </div>
</template>

<script>
  import moment from 'moment'
  import vuemaskedinput from 'vue-masked-input'
  export default {
    components: {
      'masked-input': vuemaskedinput
    },
    data () {
      return {
        originalValue: '',
        showMyself: false,
        currentMonth: moment().startOf('month'),
        selectedDateTimeObject: moment(),
        closePicker: 0,
        minuteArray: [0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60]
      }
    },
    props: [
      'value',
      'firstDay',
      'showDst',
      'showHours',
      'hourStep',
      'showMinutes',
      'minuteStep',
      'showSeconds',
      'secondStep'
    ],
    mounted () {
      this.selectedDateTimeObject = moment(this.value)
      this.currentMonth = moment(this.selectedDateTimeObject).startOf('month')
      this.originalValue = (this.value)
    },
    computed: {
      weeks () {
        let me = this
        let monthMomentObject = this.getMonthViewStartDate(this.currentMonth, this.firstDay)
        let numberOfWeeks = 5
        let weeks = []
        let lastMonth = moment(monthMomentObject)
        let daysFromLastMonth = lastMonth.daysInMonth() - lastMonth.locale('vi').format('D') + 1
        let daysInCurrentMonth = lastMonth.add(1, 'month').daysInMonth()
        let diff = daysFromLastMonth + daysInCurrentMonth - 35
        if (diff === 1 || diff === 2) {
          numberOfWeeks = 6
        }
        for (let weekIndex = 0; weekIndex < numberOfWeeks; weekIndex++) {
          weeks.push(me.getWeekObject(monthMomentObject))
        }
        return weeks
      },
      locale: function () {
        return (typeof i18n !== 'undefined') ? 'vi' : 'vi'
      }
    },
    methods: {
      pickerDataMouse (state) {
        let vm = this
        vm.closePicker = state
        setTimeout(() => {
          if (vm.closePicker === 0) {
            vm.showMyself = false
          }
        }, 200)
      },
      getMonthViewStartDate (date, firstDay) {
        firstDay = parseInt(firstDay)
        let start = moment(date)
        let startOfMonth = moment(start.startOf('month'))
        start.subtract(startOfMonth.day(), 'days')
        if (startOfMonth.day() < firstDay) {
          start.subtract(7, 'days')
        }
        start.add(firstDay, 'days')
        return start
      },
      getDayObject (monthMomentObject, dayIndex) {
        return {
          isToday: monthMomentObject.isSame(moment(), 'day'),
          isSelected: monthMomentObject.isSame(this.selectedDateTimeObject, 'day'),
          isPastDay: monthMomentObject.isBefore(moment(), 'day'),
          isCurrentMonth: monthMomentObject.isSame(this.currentMonth, 'month'),
          weekDay: dayIndex,
          isWeekEnd: (dayIndex === 5 || dayIndex === 6),
          date: moment(monthMomentObject)
        }
      },
      getWeekObject (monthMomentObject) {
        let week = []
        for (let dayIndex = 0; dayIndex < 7; dayIndex++) {
          week.push(this.getDayObject(monthMomentObject, dayIndex))
          monthMomentObject.add(1, 'day')
        }
        return week
      },
      getTitle (momentObject) {
        if (!momentObject) return
        return momentObject.locale(this.locale).format('MMMM YYYY')
      },
      selectStringToDate (value) {
        if (value !== null && value !== undefined && value !== '' && value.indexOf('_') === -1) {
          this.selectedDateTimeObject = moment(this.value, 'DD/MM/YYYY HH:mm')
          this.currentMonth = this.selectedDateTimeObject
          this.$emit('input', this.selectedDateTimeObject.locale('vi').format('DD/MM/YYYY HH:mm'))
        } else if (value === null || value === '') {
          this.$emit('input', '')
        }
      },
      handlerKeyUpEnter () {
        this.$emit('keyup.enter', '')
      },
      handlerChange () {
        this.$emit('change', '')
      },
      selectDate (date) {
        this.selectedDateTimeObject = date.hours(this.selectedDateTimeObject.hours())
          .minutes(this.selectedDateTimeObject.minutes())
          .seconds(this.selectedDateTimeObject.seconds())
        this.currentMonth = this.selectedDateTimeObject
        this.$emit('input', this.selectedDateTimeObject.locale('vi').format('DD/MM/YYYY HH:mm'))
        this.$emit('change-value', this.selectedDateTimeObject.locale('vi').format('DD/MM/YYYY HH:mm'))
      },

      goPrev () {
        this.currentMonth = moment(this.currentMonth).subtract(1, 'months')
          .hours(this.selectedDateTimeObject.hours())
          .minutes(this.selectedDateTimeObject.minutes())
          .seconds(this.selectedDateTimeObject.seconds())
      },
      goNext () {
        this.currentMonth = moment(this.currentMonth).add(1, 'months')
          .hours(this.selectedDateTimeObject.hours())
          .minutes(this.selectedDateTimeObject.minutes())
          .seconds(this.selectedDateTimeObject.seconds())
      },
      goToday () {
        this.currentMonth = moment()
      },
      selectChangeHours (n) {
        this.selectedDateTimeObject = moment(this.selectedDateTimeObject).set({h: n})
        this.selectDate(this.selectedDateTimeObject)
      },
      selectChangeMinutes (n) {
        this.selectedDateTimeObject = moment(this.selectedDateTimeObject).set({m: n})
        this.selectDate(this.selectedDateTimeObject)
      },
      incrementHours () {
        let step = this.hourStep ? this.hourStep : 1
        this.selectedDateTimeObject = moment(this.selectedDateTimeObject).add(step, 'hours')
        this.selectDate(this.selectedDateTimeObject)
      },
      decrementHours () {
        let step = this.hourStep ? this.hourStep : 1
        this.selectedDateTimeObject = moment(this.selectedDateTimeObject).subtract(step, 'hours')
        this.selectDate(this.selectedDateTimeObject)
      },
      incrementMinutes () {
        let step = this.minuteStep ? this.minuteStep : 1
        this.selectedDateTimeObject = moment(this.selectedDateTimeObject).add(step, 'minutes')
        this.selectDate(this.selectedDateTimeObject)
      },
      decrementMinutes () {
        let step = this.minuteStep ? this.minuteStep : 1
        this.selectedDateTimeObject = moment(this.selectedDateTimeObject).subtract(step, 'minutes')
        this.selectDate(this.selectedDateTimeObject)
      },
      incrementSeconds () {
        let step = this.secondStep ? this.secondStep : 1
        this.selectedDateTimeObject = moment(this.selectedDateTimeObject).add(step, 'seconds')
        this.selectDate(this.selectedDateTimeObject)
      },
      decrementSeconds () {
        let step = this.secondStep ? this.secondStep : 1
        this.selectedDateTimeObject = moment(this.selectedDateTimeObject).subtract(step, 'seconds')
        this.selectDate(this.selectedDateTimeObject)
      },
      reset () {
        this.$emit('input', this.value)
        this.showMyself = false
      },
      hideMenu () {
        this.showMyself = false
      },
      toggleDisplay () {
        if (this.value === null || this.value === '') {
          this.selectedDateTimeObject = moment()
          this.currentMonth = moment(this.selectedDateTimeObject).startOf('month')
          this.originalValue = (moment().locale('vi').format('DD/MM/YYYY HH:mm'))
        } else {
          this.selectedDateTimeObject = moment(this.value, 'DD/MM/YYYY HH:mm')
          this.currentMonth = moment(this.selectedDateTimeObject).startOf('month')
          this.originalValue = (moment(this.value, 'DD/MM/YYYY HH:mm').locale('vi').format('DD/MM/YYYY HH:mm'))
        }
        this.showMyself = !this.showMyself
      }
    },
    filters: {
      localeWeekDay (weekday, firstDay, locale) {
        firstDay = parseInt(firstDay)
        let localMoment = moment().locale(locale)
        return localMoment.localeData().weekdaysMin()[(weekday + firstDay) % 7]
      }
    }
  }
</script>

<style>
.bootstrap-datetimepicker-widget {
	display: block;
	width: 250px;
	padding: 4px;
	margin-top: 1px;
	z-index: 3000;
    border-radius: 4px;
    position: absolute;
    top: 42px;
    background: #fff;
    border: 1px solid #dddd;
    left: 0;
}

.bootstrap-datetimepicker-widget:after, .bootstrap-datetimepicker-widget:before {
	content: '';
	display: inline-block;
	position: absolute
}

.bootstrap-datetimepicker-widget:before {
	border-left: 7px solid transparent;
	border-right: 7px solid transparent;
	border-bottom: 7px solid #ccc;
	border-bottom-color: rgba(0, 0, 0, .2);
	top: -7px;
	left: 6px
}

.bootstrap-datetimepicker-widget:after {
	border-left: 6px solid transparent;
	border-right: 6px solid transparent;
	border-bottom: 6px solid #fff;
	top: -6px;
	left: 7px
}

.bootstrap-datetimepicker-widget.pull-right:before {
	left: auto;
	right: 6px
}

.bootstrap-datetimepicker-widget.pull-right:after {
	left: auto;
	right: 7px
}

.bootstrap-datetimepicker-widget > ul {
	list-style-type: none;
	margin: 0
}

.bootstrap-datetimepicker-widget .timepicker-hour, .bootstrap-datetimepicker-widget .timepicker-minute, .bootstrap-datetimepicker-widget .timepicker-second {
	width: 100%;
	font-weight: 700;
	font-size: 12px;
}

.bootstrap-datetimepicker-widget table[data-hour-format="12"] .separator {
	width: 4px;
	padding: 0;
	margin: 0
}

.bootstrap-datetimepicker-widget .picker-switch {
	text-align: center
}

.bootstrap-datetimepicker-widget table {
	width: 100%;
	margin: 0
}

.bootstrap-datetimepicker-widget td, .bootstrap-datetimepicker-widget th {
	text-align: center;
    width: 32px;
    height: 30px;
	border-radius: 0
}

.bootstrap-datetimepicker-widget td.day:hover, .bootstrap-datetimepicker-widget td.hour:hover, .bootstrap-datetimepicker-widget td.minute:hover, .bootstrap-datetimepicker-widget td.second:hover {
	background: #eee;
	cursor: pointer
}

.bootstrap-datetimepicker-widget td.not-present {
	font-style: italic;
    color: #999;
    background: #eeeeee;
}

.bootstrap-datetimepicker-widget td.today {
	text-decoration: underline
}

.bootstrap-datetimepicker-widget td.active, .bootstrap-datetimepicker-widget td.active:hover {
    background-color: #3562c1;
    background-image: none;
    background-repeat: repeat-x;
    border-color: #3562c1;
    border-color: #3562c1;
    color: #fff;
    text-shadow: none;
    border-radius: 0;
    text-decoration: none;
}

.bootstrap-datetimepicker-widget td.active.active, .bootstrap-datetimepicker-widget td.active.disabled, .bootstrap-datetimepicker-widget td.active:active, .bootstrap-datetimepicker-widget td.active:hover, .bootstrap-datetimepicker-widget td.active:hover.active, .bootstrap-datetimepicker-widget td.active:hover.disabled, .bootstrap-datetimepicker-widget td.active:hover:active, .bootstrap-datetimepicker-widget td.active:hover:hover, .bootstrap-datetimepicker-widget td.active:hover[disabled], .bootstrap-datetimepicker-widget td.active[disabled] {
	color: #fff;
	background-color: #04c
}

.bootstrap-datetimepicker-widget td.active.active, .bootstrap-datetimepicker-widget td.active:active, .bootstrap-datetimepicker-widget td.active:hover.active, .bootstrap-datetimepicker-widget td.active:hover:active {
	background-color: #039 \9
}

.bootstrap-datetimepicker-widget td.disabled, .bootstrap-datetimepicker-widget td.disabled:hover {
	background: 0;
	color: #999;
	cursor: not-allowed
}

.bootstrap-datetimepicker-widget td span {
	display: block;
	width: 47px;
	height: 20px;
	float: left;
	margin: 0;
	cursor: pointer;
	border-radius: 4px
}

.bootstrap-datetimepicker-widget td span:hover {
	background: #eee
}

.bootstrap-datetimepicker-widget td span.active {
	background-color: #006dcc;
	background-image: linear-gradient(to bottom, #08c, #04c);
	background-repeat: repeat-x;
	border-color: #04c #04c #002a80;
	border-color: rgba(0, 0, 0, .1) rgba(0, 0, 0, .1) rgba(0, 0, 0, .25);
	filter: progid:DXImageTransform.Microsoft.gradient(enabled=false);
	color: #fff;
	text-shadow: 0 -1px 0 rgba(0, 0, 0, .25)
}

.bootstrap-datetimepicker-widget td span.active.active, .bootstrap-datetimepicker-widget td span.active.disabled, .bootstrap-datetimepicker-widget td span.active:active, .bootstrap-datetimepicker-widget td span.active:hover, .bootstrap-datetimepicker-widget td span.active[disabled] {
	color: #fff;
	background-color: #04c
}

.bootstrap-datetimepicker-widget td span.active.active, .bootstrap-datetimepicker-widget td span.active:active {
	background-color: #039 \9
}

.bootstrap-datetimepicker-widget td span.disabled, .bootstrap-datetimepicker-widget td span.disabled:hover, .bootstrap-datetimepicker-widget th.disabled, .bootstrap-datetimepicker-widget th.disabled:hover {
	background: 0;
	color: #999;
	cursor: not-allowed
}

.bootstrap-datetimepicker-widget td span.old {
	color: #999
}

.bootstrap-datetimepicker-widget .table-condensed > tbody > tr > td {
	padding: 0
}

.bootstrap-datetimepicker-widget th.switch {
	width: 145px
}

.bootstrap-datetimepicker-widget th.next, .bootstrap-datetimepicker-widget th.prev {
	font-size: 21px
}

.bootstrap-datetimepicker-widget thead tr:first-child th {
	cursor: pointer
}

.bootstrap-datetimepicker-widget thead tr:first-child th:hover {
	background: #eee
}

.input-append.date .add-on i, .input-prepend.date .add-on i {
	display: block;
	cursor: pointer;
	width: 16px;
	height: 16px
}

.bootstrap-datetimepicker-widget.left-oriented:before {
	left: auto;
	right: 6px
}

.bootstrap-datetimepicker-widget.left-oriented:after {
	left: auto;
	right: 7px
}
.timepicker-picker a.btn{
    min-width: 32px;
    margin: 0;
    height: 0;
    font-size: 12px;
}
</style>