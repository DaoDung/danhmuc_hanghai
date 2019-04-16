$(document).ready(function() {

    // GET WIDTH WINDOW
    var w_Window = $(window).width();
    var h_Window = $(window).height();

    // ACCORDION
    $('.wd-accordion .wd-accordion-content:not(:first)').hide();
    $('.wd-accordion .wd-accordion-heading:first').addClass('wd-active');
    $('.wd-accordion .wd-accordion-heading').click(function() {
        $('.wd-accordion .wd-active').removeClass('wd-active');
        $('.wd-accordion .wd-accordion-content').slideUp(300);
        if ($(this).next('.wd-accordion-content').is(':hidden') === true) {
            $(this).addClass('wd-active');
            $(this).next('.wd-accordion-content').slideDown(300);
        }
    });

    // EASYTAB
    $('#tab-container').easytabs();

    // LIST MENU SIDEBAR
    $(".wd-list-menu > li").toggle(function() {
        // $("ul.wd-submenu").slideUp(300);
        $(this).find("ul.wd-submenu").slideDown(300);
    }, function() {
        $(this).find("ul.wd-submenu").slideUp(300);
    });

});