$(document).ready(function() {
    var newid=$("#newsid").attr("name");
    var userid=$("#uid").attr("name");


    var sea= $(".ser1").attr("name");
    if(sea=="1"){
        $("#lunbtn1").click(function () {
            alert("登入方可评论");
        });
        $("button[name='lunbtn2']").click(function () {
            alert("登入方可评论");
        });
    }else {
        // 评论按钮
        $("#lunbtn1").click(function () {
            var context=$("#saytext197460").val();
            var time= dateFormat("YYYY-mm-dd HH:MM",new Date());
            // alert(newid+"   "+time+"  "+userid+"  "+context);
            if(context.length==0){
                alert("评论不可为空");
            }
            else {
                $.ajax({
                    type:"POST",
                    url:"/pinglun",
                    data:{
                        comments_nid:newid,
                        comments_uid:userid,
                        comments_context:context,
                        comments_time:time,
                    },
                    async:true,
                    success:function (date) {
                        $("#pinglunid").html(date);
                        $("#saytext197460").val("");
                        // window.location.reload();
                    },
                    error:function (e) {
                        alert("评论失败请检查你的网络");
                    },

                });
            }

        });

        //点评
        // var zhupinid=$(".zhupingid").attr("name");
        // $("button[name='lunbtn2']").click(function () {
        //     var context=$("textarea[name='dianping2']").val();
        //     var time= dateFormat("YYYY-mm-dd HH:MM",new Date());
        //     if(context.length==0){
        //         alert("评论不可为空");
        //     }
        //     else {
        //         alert(huifuname);
        //         $.ajax({
        //             type:"POST",
        //             url:"/dianping",
        //             data:{
        //                 reply_commid:zhupinid,
        //                 reply_uid:userid,
        //                 reply_reuid:huifuname,
        //                 comments_nid:newid,
        //                 comments_context:context,
        //                 comments_time:time,
        //             },
        //             async:true,
        //             success:function (date) {
        //                 $("#pinglunid").html(date);
        //             },
        //             error:function (e) {
        //                 alert("评论失败请检查你的网络");
        //             },
        //
        //         });
        //     }
        //
        // });
    }

    function dateFormat(fmt, date) {
        let ret;
        const opt = {
            "Y+": date.getFullYear().toString(),        // 年
            "m+": (date.getMonth() + 1).toString(),     // 月
            "d+": date.getDate().toString(),            // 日
            "H+": date.getHours().toString(),           // 时
            "M+": date.getMinutes().toString(),         // 分
            "S+": date.getSeconds().toString()          // 秒
            // 有其他格式化字符需求可以继续添加，必须转化成字符串
        };
        for (let k in opt) {
            ret = new RegExp("(" + k + ")").exec(fmt);
            if (ret) {
                fmt = fmt.replace(ret[1], (ret[1].length == 1) ? (opt[k]) : (opt[k].padStart(ret[1].length, "0")))
            };
        };
        return fmt;
    }

});