$(document).ready(function(){
    $("#mylogin").click(function () {
        var user=$("#login_username").val();
        var password=$("#login_password").val();
        var up={
            user2:user,
            password2:password,
        };
        $.ajax({
            type:"POST",
            url:"/login",
            data:JSON.stringify(up),
            dataType:"json",
            async:false,
            headers : {"Content-Type" : "application/json;charset=utf-8"},
            success:function (date) {
                if(date.msg=="用户不存在"){
                    $("#flog").html("<p style='color: red'>**用户不存在</p>");
                }
                if(date.msg=="用户密码错误"){
                    $("#flog").html("<p style='color: red'>**用户密码错误</p>");
                }
                if(date.msg=="登录成功"){
                    alert(date.msg);
                    // $("#dengru").css("display","one");
                    window.location.reload();
                }
            },
            error:function (e) {
                alert("错误")
            },
        });
    });



});