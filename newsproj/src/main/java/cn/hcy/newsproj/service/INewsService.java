package cn.hcy.newsproj.service;

import cn.hcy.newsproj.entity.News;
import org.springframework.stereotype.Service;

import java.util.List;

public interface INewsService {
    //按照类型查询
    public List<News> findNewsByattribute(String str);
    //按照类型查询指定数目
    public List<News> findNewsByattribute10(String string,Integer nb);
    //查询所有时间最新的新闻不包含24
    public List<News> findbNewsByAllTime(String string,Integer nb);
    // //查询所有新闻不包含24
//    public List<News> findbNewsByAll(String string,Integer nb);
    //分页方法
    public List<News> findNewsByAllPage(Integer pageNum,Integer pageSize);
    //根据id查询
    public News findNewsById(Integer integer);
    //类别 时间
    public List<News> findNewsByAttributetime(String string,Integer pageNum,Integer pageSize);
}
