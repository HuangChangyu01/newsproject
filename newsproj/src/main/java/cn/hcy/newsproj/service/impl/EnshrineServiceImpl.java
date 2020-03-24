package cn.hcy.newsproj.service.impl;

import cn.hcy.newsproj.entity.Enshrine;
import cn.hcy.newsproj.mapper.IEnshrineMapper;
import cn.hcy.newsproj.service.IEnshrineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnshrineServiceImpl implements IEnshrineService {
    @Autowired
    IEnshrineMapper iEnshrineMapper;
    @Override
    public Enshrine findByEnshrine(Integer nid, String uid) {
        return  iEnshrineMapper.fingByEnshrine(nid,uid);
    }

    @Override
    public void insertEnshrine(Integer nid,String uid) {
        iEnshrineMapper.insertEnshrine(nid,uid);
    }

    @Override
    public void deleteEnshrine(Integer nid,String uid) {
        iEnshrineMapper.deleteEnshrine(nid,uid);
    }

    @Override
    public List<Enshrine> findByuid(String str) {
        return  iEnshrineMapper.findByUid(str);
    }
}
