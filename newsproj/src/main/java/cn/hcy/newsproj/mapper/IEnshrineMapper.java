package cn.hcy.newsproj.mapper;

import cn.hcy.newsproj.entity.Enshrine;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IEnshrineMapper {
    //查询新闻收藏数量
    public Integer findByEnshrineNumber(Integer nid);
    //查询收藏
    public Enshrine fingByEnshrine(@Param("nid") Integer nid,@Param("uid") String uid);
    //插入收藏
    public void  insertEnshrine(@Param("nid") Integer nid,@Param("uid") String uid);
    //删除收藏
    public void deleteEnshrine(@Param("nid") Integer nid,@Param("uid") String uid);

    public List<Enshrine> findByUid(String uid);

}
