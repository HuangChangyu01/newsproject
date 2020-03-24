package cn.hcy.newsproj.mapper;

import cn.hcy.newsproj.entity.News;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 查询新闻接口
 */

@Repository
public interface INewsMapper {
    //按照类型查询
    public List<News> findNewsByAttribute(String str);
    //按照类查询10条记录
    public List<News> findNewsByAttribute10(@Param("news_attribute") String str, @Param("nb")Integer nb);
    //查询所有时间最新的新闻不包含24 限制数目
    public List<News> findbNewsByAllTime(@Param("news_attribute") String str, @Param("nb")Integer nb);
    //查询所有时间最新的新闻不包含24
    public List<News> findbNewsByAll(@Param("news_attribute") String str);
    //根据id查询新闻相关信息 包括 评论
    public News findNewsById(Integer integer);
    //根据类别 时间排序
    public List<News> findNewsByAttributetime(String str);
}
