// 封装一个Ajax
function Ajaxtools(_url,_sucessCallBack,completeCallBack){
    $.ajax({
        type:"get",    //请求方式
        async:true,    //是否异步
        cache: true,
        url: _url,
        dataType:"json",    //跨域json请求一定是jsonp
        //jsonp: "callback",    //跨域请求的参数名，默认是callback
        //jsonpCallback:"successCallback",    //自定义跨域参数值，回调函数名也是一样，默认为jQuery自动生成的字符串
        data:"",//{"query":"civilnews"},    //请求参数

        beforeSend: function() {
        //请求前的处理
        },
        success: _sucessCallBack,
        //请求完成的处理
        complete: completeCallBack,

        error: function() {
        //请求出错处理
            alert("error");
        }
        });
}

$(function() {
    $(".return_left").click(function() {
        if ($(".content_left").offset().left >= 0) {
            $(".content_left").animate({ "left": "-18%" }, 300);
            $(".content_right").animate({ "width": "100%" }, 300, function() {
                $(".r_left").addClass("r_right");
            });
        } else if ($(".content_left").offset().left < 0) {
            $(".content_left").animate({ "left": 0 }, 300);
            $(".content_right").animate({ "width": "82%" }, 300, function() {
                $(".r_left").removeClass("r_right");
            });
        }
    })

    for (var i = 0; i < $(".schedule").length; i++) {
        $(".schedule").eq(i).css('width', $(".schedule").eq(i).children("p").text())
    }

    // 绑定事件
    levelA();
    $("#levelA").change(function(){levelB();});
    $("#levelB").change(function(){levelC();});
    $("#inputExcel").click(function(){inputExcel()});
})



// 导出表格
function inputExcel(){ 

    $("#topKeyword").table2excel({
          exclude: ".noExl",// 不想导出的行加上class='noExl'即可
          name: "Excel Document Name", // excel文档名
          filename: "塔尖词"// excel文件名
        });
}

// 加载一级类目
function levelA(){
    $("#levelA").html("-");
    Ajaxtools("http://211.95.60.40:16868/findByType?type=levelA",function(datas) {
        if(datas != null){
            $(datas).each(function(i,val){
                $("#levelA").append("<option value ="+val.id+">"+val.categoryName+"</option>");
            })
            levelB();
        }
    },null);
}

// 加载二级类目
function levelB(){
    var levelAVar = $("#levelA").val();
    $("#levelB").html("-");
        if(levelAVar != undefined){
            Ajaxtools("http://211.95.60.40:16868/findByLevelNode?levelNode="+levelAVar,function(datas) {
            if(datas != null){
                $(datas).each(function(i,val){
                    $("#levelB").append("<option value ="+val.id+">"+val.categoryName+"</option>");
                })
                levelC();
            }
        },null);
    }
}

// 加载三级类目
function levelC(){
    $("#levelC").html("-");
    var levelBVar = $("#levelB").val();
        if(levelBVar != undefined){
            Ajaxtools("http://211.95.60.40:16868/findByLevelNode?levelNode="+levelBVar,function(datas) {
            if(datas != null){
                $(datas).each(function(i,val){
                    $("#levelC").append("<option value ="+val.leafId+">"+val.categoryName+"</option>");
                })
            }
        },null);
    }
}


