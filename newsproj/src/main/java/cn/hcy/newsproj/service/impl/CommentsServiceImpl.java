package cn.hcy.newsproj.service.impl;

import cn.hcy.newsproj.entity.Commnets2;
import cn.hcy.newsproj.entity.Reply;
import cn.hcy.newsproj.mapper.ICommentsMapper;
import cn.hcy.newsproj.mapper.IReplyMapper;
import cn.hcy.newsproj.service.ICommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentsServiceImpl implements ICommentsService {
    @Autowired
    ICommentsMapper iCommentsMapper;
    @Autowired
    IReplyMapper iReplyMapper;
    @Override
    public void insertComments(Commnets2 commnets2) {
        iCommentsMapper.insertCommnents(commnets2);
    }

    @Override
    public void insertReply(Reply reply) {
        iReplyMapper.insertReply(reply);
    }
}
