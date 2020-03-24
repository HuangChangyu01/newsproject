package cn.hcy.newsproj.mapper;

import cn.hcy.newsproj.entity.Reply;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IReplyMapper {
    //根据评论主id查询
    public List<Reply> fingReplyById(Integer integer);

    //插入回复
    public void  insertReply(Reply reply);
}
