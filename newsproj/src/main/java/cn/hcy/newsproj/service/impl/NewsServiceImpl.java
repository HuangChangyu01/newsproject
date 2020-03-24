package cn.hcy.newsproj.service.impl;

import cn.hcy.newsproj.entity.News;
import cn.hcy.newsproj.mapper.INewsMapper;
import cn.hcy.newsproj.service.INewsService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *新闻查询service
 */
@Service
public class NewsServiceImpl implements INewsService {
    @Autowired
    INewsMapper iNewsMapper;
    @Override
    public List<News> findNewsByattribute(String str) {
       return iNewsMapper.findNewsByAttribute(str);
    }

    @Override
    public List<News> findNewsByattribute10(String string,Integer nb) {
        return iNewsMapper.findNewsByAttribute10(string,nb);
    }

    @Override
    public List<News> findbNewsByAllTime(String string, Integer nb) {
        return iNewsMapper.findbNewsByAllTime(string,nb);
    }

//    @Override
//    public List<News> findbNewsByAll(String string, Integer nb) {
//        return iNewsMapper.findbNewsByAll(string,nb);
//    }

    @Override
    public List<News> findNewsByAllPage(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<News> list=iNewsMapper.findbNewsByAll("24小时");
        return list;
    }
    //根据id查询
    @Override
    public News findNewsById(Integer integer) {
        return iNewsMapper.findNewsById(integer);
    }

    @Override
    public List<News> findNewsByAttributetime(String string,Integer pageNum,Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<News> list=iNewsMapper.findNewsByAttributetime(string);
        return list;
    }
}
