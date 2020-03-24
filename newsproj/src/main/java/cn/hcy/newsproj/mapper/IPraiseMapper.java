package cn.hcy.newsproj.mapper;

import cn.hcy.newsproj.entity.Praise;
import org.springframework.stereotype.Repository;

@Repository
public interface IPraiseMapper {

    //查询点赞
    public Praise findPraiseNumber(Integer nid);
    //点赞+1
    public void  insertPraise(Integer integer);
    //点赞-1
    public void updatePraise(Integer integer);

}
