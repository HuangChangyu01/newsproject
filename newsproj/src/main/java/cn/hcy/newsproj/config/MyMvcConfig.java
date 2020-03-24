package cn.hcy.newsproj.config;

//import cn.hcy.newsproj.config.interceptor.LoginHandlerInterceptor;
import cn.hcy.newsproj.config.interceptor.LoginHandlerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyMvcConfig implements WebMvcConfigurer {

    @Bean
    public WebMvcConfigurer webMvcConfigurer(){
        WebMvcConfigurer web=new WebMvcConfigurer() {
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
//                registry.addViewController("/").setViewName("home");
//                registry.addViewController("/News").setViewName("home");
//                registry.addViewController("/main.html").setViewName("dashboard");
            }

            //拦截器
            @Override
            public void addInterceptors(InterceptorRegistry registry) {
                registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/Mymessage")
                        .excludePathPatterns("/","/home.html","/details","/column","/resources/static/**");
            }
        };
        return  web;
    }
}
