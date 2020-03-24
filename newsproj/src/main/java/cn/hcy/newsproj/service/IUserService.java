package cn.hcy.newsproj.service;

import cn.hcy.newsproj.entity.user;

public interface IUserService {

    public user login(String userid,String pasword);

    public user findUser(String userid);

    public void insertUser(String id,String pass);
}
