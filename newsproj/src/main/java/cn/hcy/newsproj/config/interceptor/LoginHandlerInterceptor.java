package cn.hcy.newsproj.config.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginHandlerInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object user=request.getSession().getAttribute("userid");
        if(user==null){
            //未登入
            request.setAttribute("msg","没有权限请登入");
            request.getRequestDispatcher("/home.html").forward(request,response);
            return false;
        }else{
            //已登入
            return  true;
        }

    }
}
