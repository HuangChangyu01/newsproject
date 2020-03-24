package cn.hcy.newsproj.controller;

import cn.hcy.newsproj.entity.user;
import cn.hcy.newsproj.service.IUserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
public class LoginConntroller {

    @Autowired
    IUserService iUserService;

    @RequestMapping("/aaaa")
    public String aaaa(){
        return "index111";
    }

    @RequestMapping("/login")
    @ResponseBody
    public Map<String,String> login(@RequestBody Map<String,String> map, HttpSession session){
        String uid=map.get("user2");
        String pass=map.get("password2");
        System.out.println(uid+"  "+pass);
        Map<String,String> map1=new HashMap<>();
        user uu=iUserService.findUser(uid);
        if(uu==null){
            map1.put("msg","用户不存在");
        }
        else{
            user u2=iUserService.login(uid,pass);
            if(u2!=null){
                map1.put("msg","登录成功");
                session.setAttribute("userid",u2.getUser_id());
                session.setAttribute("username",u2.getUser_name());
                session.setAttribute("hobby",u2.getUser_hobby());
                session.setAttribute("brith",u2.getUser_brith());
                session.setAttribute("sex",u2.getUser_sex());

            }
            else {
                map1.put("msg","用户密码错误");
            }
        }
        return  map1;

    }
    @RequestMapping("/zhuche")
    @ResponseBody
    public Map<String,String>  zhuce(@RequestBody Map<String,String> map){
        String user=map.get("user2");
        String pass=map.get("password2");
        Map<String,String> map1=new HashMap<>();
        user uu=iUserService.findUser(user);
        if(uu==null){
            iUserService.insertUser(user,pass);
            map1.put("se","注册成功");
        }else {
            map1.put("se","存在");
        }
        return map1;
    }
}
