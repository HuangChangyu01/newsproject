package cn.hcy.newsproj.controller;

import cn.hcy.newsproj.entity.Commnets2;
import cn.hcy.newsproj.entity.Enshrine;
import cn.hcy.newsproj.entity.News;
import cn.hcy.newsproj.service.ICommentsService;
import cn.hcy.newsproj.service.IEnshrineService;
import cn.hcy.newsproj.service.INewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class CommentsConroller {
    @Autowired
    INewsService newsService;
    @Autowired
    ICommentsService iCommentsService;
    @Autowired
    IEnshrineService iEnshrineService;
    @RequestMapping("/pinglun")
    public String pinlun(Commnets2 commnets2, Model model){
        System.out.println("评论方法"+commnets2);
        iCommentsService.insertComments(commnets2);
        News news=newsService.findNewsById(commnets2.getComments_nid());
        model.addAttribute("newsDetals",news);
        return "details::pinglunone";
    }

}
