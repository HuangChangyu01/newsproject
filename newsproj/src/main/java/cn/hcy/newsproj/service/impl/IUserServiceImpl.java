package cn.hcy.newsproj.service.impl;

import cn.hcy.newsproj.entity.user;
import cn.hcy.newsproj.mapper.IUserMapper;
import cn.hcy.newsproj.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class IUserServiceImpl implements IUserService {
    @Autowired
    IUserMapper iUserMapper;
    @Override
    public user login(String userid, String pasword) {
        return iUserMapper.login(userid,pasword);
    }

    @Override
    public user findUser(String userid) {
        return iUserMapper.findUser(userid);
    }

    @Override
    public void insertUser(String id, String pass) {
        String name="";
        for (int i=0;i<2;i++){
            name+=this.getNmae();
        }

        iUserMapper.insertUser(id,pass,name);
    }
    public String getNmae(){
        Random ran = new Random();
        final  int delta = 0x9fa5 - 0x4e00 + 1;
        char a=(char)(0x4e00 + ran.nextInt(delta));
        String aa=a+"";
        return aa;
    }
}
