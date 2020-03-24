package cn.hcy.newsproj.mapper;

import cn.hcy.newsproj.entity.user;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserMapper {
    //查询密码
    public user login(@Param("userid") String userid, @Param("password") String password);
    //查询用户是否存在
    public user findUser(String userid);
    //注册
    public void  insertUser(@Param("user_id") String user_id,@Param("user_password") String user_password,@Param("user_name") String user_name);
}
