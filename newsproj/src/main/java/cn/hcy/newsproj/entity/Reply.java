package cn.hcy.newsproj.entity;

public class Reply {
    private Integer reply_id;
    private Integer reply_commid;
    private String reply_uid;
    private String reply_reuid;
    private String reply_context;
    private String reply_time;
    private user user1;


    @Override
    public String toString() {
        return "Reply{" +
                "reply_id=" + reply_id +
                ", reply_commid=" + reply_commid +
                ", reply_uid='" + reply_uid + '\'' +
                ", reply_reuid='" + reply_reuid + '\'' +
                ", reply_context='" + reply_context + '\'' +
                ", reply_time='" + reply_time + '\'' +
                '}';
    }

    public user getUser1() {
        return user1;
    }

    public void setUser1(user user1) {
        this.user1 = user1;
    }

    public Integer getReply_id() {
        return reply_id;
    }

    public void setReply_id(Integer reply_id) {
        this.reply_id = reply_id;
    }

    public Integer getReply_commid() {
        return reply_commid;
    }

    public void setReply_commid(Integer reply_commid) {
        this.reply_commid = reply_commid;
    }

    public String getReply_uid() {
        return reply_uid;
    }

    public void setReply_uid(String reply_uid) {
        this.reply_uid = reply_uid;
    }

    public String getReply_reuid() {
        return reply_reuid;
    }

    public void setReply_reuid(String reply_reuid) {
        this.reply_reuid = reply_reuid;
    }

    public String getReply_context() {
        return reply_context;
    }

    public void setReply_context(String reply_context) {
        this.reply_context = reply_context;
    }

    public String getReply_time() {
        return reply_time;
    }

    public void setReply_time(String reply_time) {
        this.reply_time = reply_time;
    }
}
