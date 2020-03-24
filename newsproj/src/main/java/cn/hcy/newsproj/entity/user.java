package cn.hcy.newsproj.entity;

/**
 * 用户表实体类
 */
public class user {
    private String user_id;
    private String user_password;
    private String user_name;
    private String user_sex;
    private String user_brith;
    private String user_hobby;



    @Override
    public String toString() {
        return "user{" +
                "user_id='" + user_id + '\'' +
                ", user_password='" + user_password + '\'' +
                ", user_name='" + user_name + '\'' +
                ", user_sex='" + user_sex + '\'' +
                ", user_brith='" + user_brith + '\'' +
                ", user_hobby='" + user_hobby + '\'' +
                '}';
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_sex() {
        return user_sex;
    }

    public void setUser_sex(String user_sex) {
        this.user_sex = user_sex;
    }

    public String getUser_brith() {
        return user_brith;
    }

    public void setUser_brith(String user_brith) {
        this.user_brith = user_brith;
    }

    public String getUser_hobby() {
        return user_hobby;
    }

    public void setUser_hobby(String user_hobby) {
        this.user_hobby = user_hobby;
    }
}
