package cn.hcy.newsproj.controller;

import cn.hcy.newsproj.entity.News;
import cn.hcy.newsproj.service.INewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class NewsController {
    @Autowired
    INewsService serviceDao;
    @RequestMapping("/")
    public String newstoutiao(Model model){
        List<News> toutiaoli=serviceDao.findNewsByattribute("头条");
        model.addAttribute("toutiao1",toutiaoli.get(0));
        model.addAttribute("toutiao2",toutiaoli.get(1));
        model.addAttribute("toutiao3",toutiaoli.get(2));

        List<News> tuijian=serviceDao.findNewsByattribute10("24小时",10);
        model.addAttribute("xiaoshi",tuijian);

        List<News> news_3=serviceDao.findbNewsByAllTime("24小时",3);
        model.addAttribute("news3",news_3);

//        List<News> news_music1=serviceDao.findNewsByattribute10("音乐",1);
//        model.addAttribute("news_music1",news_music1.get(0));

        List<News> news_music2=serviceDao.findNewsByattribute10("音乐",2);
        model.addAttribute("news_music2",news_music2);

        List<News> news_game1=serviceDao.findNewsByattribute10("动漫",1);
        model.addAttribute("news_game1",news_game1.get(0));

        //喜欢的栏目  后续更改
        List<News> news_like=serviceDao.findbNewsByAllTime("24小时",5);
        model.addAttribute("news_like",news_like);

        //电影
        List<News> news_dianying=serviceDao.findNewsByattribute10("电影",5);
        model.addAttribute("news_dianying",news_dianying);

        //所有
//        List<News> news_All=serviceDao.findbNewsByAll("24小时",12);
//        model.addAttribute("news_all",news_All);


        List<News> news_All=serviceDao.findNewsByAllPage(1,12);
        model.addAttribute("news_all",news_All);










        return "home";
    }

/*    @RequestMapping("/fengye")
    @ResponseBody
    public Map<String,String>  fengye(@RequestBody Map<String,String> map,Model model) {
//        System.out.println(request.getParameter("age"));
        Integer page=Integer.parseInt(map.get("pnum"));
        System.out.println(page);
        List<News> news_All=serviceDao.findNewsByAllPage(page,12);
        model.addAttribute("news_all",news_All);
        Map<String,String> map2=new HashMap<>();
        map2.put("huan","home::divage");
        return map2;
    }*/

    @RequestMapping("/fengye")
    public String  fengye(String pnum,Model model) {
        System.out.println(pnum);
        List<News> news_All=serviceDao.findNewsByAllPage(Integer.parseInt(pnum),12);
        model.addAttribute("news_all",news_All);
        return "home::divage";
    }
}
