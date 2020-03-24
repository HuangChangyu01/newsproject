package cn.hcy.newsproj.service;

import cn.hcy.newsproj.entity.Enshrine;

import java.util.List;

public interface IEnshrineService {

    public Enshrine findByEnshrine(Integer nid,String uid);

    public void insertEnshrine(Integer nid,String uid);
    public void deleteEnshrine(Integer nid,String uid);
    public List<Enshrine> findByuid(String str);
}
