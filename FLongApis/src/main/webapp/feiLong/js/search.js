$(function() {
    var $select = $('#test-select');
    console.log($select)
    $.ajax({
        url: "./data/search.json",
        dataType: "json",
        type: "GET",
        success: function(data) {
            console.log(data);
            var arr = data.header;
            for (var i = 0; i < arr.length; i++) {
                console.log(arr[i]);
                for (var j = 0; j < arr[i].sec_menu.length; j++) {
                    var $option = $('<option value="' + arr[i].fir_title + '" data-section="' + arr[i].fir_title + '/' + arr[i].sec_menu[j].categoryname + '">鞋子</option>');
                    $select.append($option);
                }
            }
            $select.treeMultiselect({
                enableSelectAll: true,
                sortable: true,
                hideSidePanel: true,
                startCollapsed: true,
            });
        }
    })
    $(".arrow_classify").click(function() {
        $(this).siblings("ul").slideToggle(100);
        $(this).children(".close_arr").toggleClass("open");
    });


})