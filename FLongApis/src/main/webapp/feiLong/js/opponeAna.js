$(function() {
    $(".arrow_classify,.produc_name").click(function() {
        $(this).siblings("ul").slideToggle(100);
        $(this).children(".close_arr").toggleClass("open");
        $(this).prev().children(".close_arr").toggleClass("open");
    });
    $("#page").initPage(41, 1, function(page) {
        // alert(page);
    });
})