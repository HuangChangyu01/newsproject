package cn.hcy.newsproj.service.impl;

import cn.hcy.newsproj.entity.Praise;
import cn.hcy.newsproj.mapper.IPraiseMapper;
import cn.hcy.newsproj.service.IPraiseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PraiseServiceImpl implements IPraiseService {
    @Autowired
    IPraiseMapper iPraiseMapper;

    @Override
    public void insertPraise(Integer integer) {
        iPraiseMapper.insertPraise(integer);
    }

    @Override
    public void updatePraise(Integer integer) {
        iPraiseMapper.updatePraise(integer);
    }
}
