package cn.hcy.newsproj.controller;

import cn.hcy.newsproj.entity.Enshrine;
import cn.hcy.newsproj.entity.News;
import cn.hcy.newsproj.mapper.IPraiseMapper;
import cn.hcy.newsproj.service.IEnshrineService;
import cn.hcy.newsproj.service.INewsService;
import cn.hcy.newsproj.service.IPraiseService;
import cn.hcy.newsproj.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
//@RequestMapping("/news")
public class DetailsController {
    @Autowired
    INewsService newsServiceDao;
    @Autowired
    IPraiseService iPraiseService;
    @Autowired
    IUserService iUserService;
    @Autowired
    IEnshrineService iEnshrineService;

    @GetMapping("/details/{nid}")
    public String NewsDetails(@PathVariable("nid") Integer id, Model model, HttpServletRequest request){
        System.out.println(id);
        News newsList=newsServiceDao.findNewsById(id);
        model.addAttribute("newsDetals",newsList);

        List<News> newshot=newsServiceDao.findbNewsByAllTime("24小时",5);
        model.addAttribute("newshot",newshot);

        Object userid=request.getSession().getAttribute("userid");
        if(userid!=null){
            Enshrine enshrine=iEnshrineService.findByEnshrine(id,userid.toString());
            model.addAttribute("enshine",enshrine);
        }
        else {
            model.addAttribute("enshine",null);
        }



        return "details";
    }
    @RequestMapping("/dian")
    public String dian(String nnid,Model model){
        System.out.println(nnid);
        iPraiseService.insertPraise(Integer.parseInt(nnid));
        News newsList=newsServiceDao.findNewsById(Integer.parseInt(nnid));
        model.addAttribute("newsDetals",newsList);

        return "details::detailsdianzhang";
    }

    @RequestMapping("/jian")
    public String jian(String nnid,Model model){
        System.out.println(nnid);
        iPraiseService.updatePraise(Integer.parseInt(nnid));
        News newsList=newsServiceDao.findNewsById(Integer.parseInt(nnid));
        model.addAttribute("newsDetals",newsList);
        return "details::detailsdianzhang";
    }
    @RequestMapping("/insertEnshrine")
    @ResponseBody
    public Map<String,String> insertEnshrine(@RequestBody Map<String,String> map,HttpServletRequest request){
        String nnid=map.get("nnid");
        Object userid=request.getSession().getAttribute("userid");
        System.out.println("这里："+nnid+"      "+userid);
        iEnshrineService.insertEnshrine(Integer.parseInt(nnid),userid.toString());
        Map<String,String> map1=new HashMap<>();
        map1.put("h","成功");
        return map1;
    }

    @RequestMapping("/deleteEnshrine")
    @ResponseBody
    public Map<String,String> deleteEnshrine(@RequestBody Map<String,String> map,HttpServletRequest request){
        String nnid=map.get("nnid");
        Object userid=request.getSession().getAttribute("userid");
        System.out.println("这里2："+nnid+"      "+userid);
        iEnshrineService.deleteEnshrine(Integer.parseInt(nnid),userid.toString());
        Map<String,String> map1=new HashMap<>();
        map1.put("h","成功");
        return map1;
    }

    @RequestMapping("/tuichu")
    public String tuichu(HttpSession session,SessionStatus sessionStatus){
        session.invalidate();
        sessionStatus.setComplete();
        return "redirect:/";
    }


}
