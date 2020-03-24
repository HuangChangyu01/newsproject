package cn.hcy.newsproj.controller;

import cn.hcy.newsproj.entity.Enshrine;
import cn.hcy.newsproj.service.IEnshrineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class MymessageConntroller {
    @Autowired
    IEnshrineService iEnshrineService;

    @RequestMapping("/Mymessage")
    public String mymessage(HttpServletRequest request, Model model){
        List<Enshrine> enshrineList=iEnshrineService.findByuid(request.getSession().getAttribute("userid").toString());
        model.addAttribute("enshrinelist",enshrineList);
        return "Mymessage";
    }
}
