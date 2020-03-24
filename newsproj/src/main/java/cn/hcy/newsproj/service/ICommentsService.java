package cn.hcy.newsproj.service;

import cn.hcy.newsproj.entity.Commnets2;
import cn.hcy.newsproj.entity.Reply;

public interface ICommentsService {

    //评论
    public void insertComments(Commnets2 commnets2);
    //点评回复
    public void insertReply(Reply reply);
}
