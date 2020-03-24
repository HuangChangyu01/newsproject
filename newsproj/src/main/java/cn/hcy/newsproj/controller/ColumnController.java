package cn.hcy.newsproj.controller;

import cn.hcy.newsproj.entity.News;
import cn.hcy.newsproj.service.INewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ColumnController {
    @Autowired
    INewsService iNewsService;
    @RequestMapping("/colimn/{lei}")
    public String colimn(@PathVariable("lei")String lei,Model model){
        List<News> newsListColumn=iNewsService.findNewsByAttributetime(lei,1,8);
        model.addAttribute("columnews",newsListColumn);
        model.addAttribute("leibie",lei);
        List<News> tuijian=iNewsService.findNewsByattribute10("24小时",10);
        model.addAttribute("xiaoshi2",tuijian);
        return "column";
    }
    @RequestMapping("/colimn/fenye")
    public String fengye(String leibie,String pnum,Model model){
        System.out.println(leibie+"   "+pnum);
        List<News> newsListColumn=iNewsService.findNewsByAttributetime(leibie,Integer.parseInt(pnum),8);
        model.addAttribute("columnews",newsListColumn);
        model.addAttribute("leibie",leibie);
        return "column::fenye";
    }
}
