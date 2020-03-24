package cn.hcy.newsproj.mapper;

import cn.hcy.newsproj.entity.Commnets2;
import cn.hcy.newsproj.entity.comments;
import org.springframework.stereotype.Repository;
import org.thymeleaf.model.IComment;

import java.util.List;

@Repository
public interface  ICommentsMapper {
    //查询评论数量
    public Integer findCommnetsNumber(Integer nid);
    //根据新闻id查询评论
    public List<comments> findCommentsbyId(Integer integer);
    //插入评论
    public void insertCommnents(Commnets2 commnets2);
}
