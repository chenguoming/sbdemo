/**
 * 登录
 */
function login(){
    $.post("/login",$("#useLogin").serialize(),function(data){
        if(data.status == 1){
            window.location.href="/system/home";
        }else{
            layer.alert(data.msg);
        }
    });
}