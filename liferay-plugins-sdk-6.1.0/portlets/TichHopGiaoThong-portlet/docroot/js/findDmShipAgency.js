/*jslint  browser: true, white: true, plusplus: true */
/*global $, countries */

$(function() {
  'use strict';
  
  //dmShipAgencies la var in file dmShipAgencies.js
  var dmShipAgencyArray = $.map(dmShipAgencies, function(value, key) {
    return {
      value : value,
      data : key
    };
  });
  
  // Setup jQuery ajax mock:
  $.mockjax({
    url : '*',
    responseTime : 2000,
    response : function(settings) {
      var query = settings.data.query;
      var queryLowerCase = query.toLowerCase();
      var re = new RegExp('\\b' + $.Autocomplete.utils.escapeRegExChars(queryLowerCase), 'gi');
      var suggestions = $.grep(dmShipAgencyArray, function(item) {
        // return country.value.toLowerCase().indexOf(queryLowerCase) === 0;
        return re.test(item.value);
      }), response = {
        query : query,
        suggestions : suggestions
      };
      
      this.responseText = JSON.stringify(response);
    }
  });
  
  // Initialize ajax autocomplete:
  $('#nameArrivalShipAgency').autocomplete({
    // serviceUrl: '/autosuggest/service/url',
    lookup : dmShipAgencyArray,
    minChars : 4,
    lookupFilter : function(suggestion, originalQuery, queryLowerCase) {
      //var re = new RegExp('\\b' + $.Autocomplete.utils.escapeRegExChars(queryLowerCase), 'gi');
      var re = new RegExp('' + $.Autocomplete.utils.escapeRegExChars(queryLowerCase), 'gi');
      return re.test(suggestion.value);
    },
    onSelect : function(suggestion) {
      //$('#selction-ajax').html('You selected: ' + suggestion.value + ', ' + suggestion.data);
      $('#arrivalShipAgency').val(suggestion.data);
    },
    onHint : function(hint) {
      $('#autocomplete-ajax-ArrivalShipAgency').val(hint);
    },
    onInvalidateSelection : function() {
      //$('#selction-ajax').html('You selected: none');
      $('#arrivalShipAgency').val('');
    }
  });
  
  $('#nameDepartureShipAgency').autocomplete({
    // serviceUrl: '/autosuggest/service/url',
    lookup : dmShipAgencyArray,
    minChars : 4,
    lookupFilter : function(suggestion, originalQuery, queryLowerCase) {
      
      //var re = new RegExp('\\b' + $.Autocomplete.utils.escapeRegExChars(queryLowerCase), 'gi');
      var re = new RegExp('' + $.Autocomplete.utils.escapeRegExChars(queryLowerCase), 'gi');
      return re.test(suggestion.value);
    },
    onSelect : function(suggestion) {
      //$('#selction-ajax').html('You selected: ' + suggestion.value + ', ' + suggestion.data);
      $('#departureShipAgency').val(suggestion.data);
    },
    onHint : function(hint) {
      $('#autocomplete-ajax-DepartureShipAgency').val(hint);
    },
    onInvalidateSelection : function() {
      //$('#selction-ajax').html('You selected: none');
      $('#departureShipAgency').val('');
    }
  });
  
  // Initialize autocomplete with custom appendTo:
  $('#autocomplete-custom-append').autocomplete({
    lookup : dmShipAgencyArray,
    appendTo : '#suggestions-container'
  });
  
  // Initialize autocomplete with custom appendTo:
  $('#autocomplete-dynamic').autocomplete({
    lookup : dmShipAgencyArray
  });
});