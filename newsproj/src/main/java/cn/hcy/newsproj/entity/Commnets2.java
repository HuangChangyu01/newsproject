package cn.hcy.newsproj.entity;

public class Commnets2 {
    private  Integer comments_id;
    private  Integer comments_nid;
    private  String  comments_uid;
    private  String  comments_context;
    private  String  comments_time;

    @Override
    public String toString() {
        return "Commnets2{" +
                "comments_id=" + comments_id +
                ", comments_nid=" + comments_nid +
                ", comments_uid='" + comments_uid + '\'' +
                ", comments_context='" + comments_context + '\'' +
                ", comments_time='" + comments_time + '\'' +
                '}';
    }

    public Integer getComments_id() {
        return comments_id;
    }

    public void setComments_id(Integer comments_id) {
        this.comments_id = comments_id;
    }

    public Integer getComments_nid() {
        return comments_nid;
    }

    public void setComments_nid(Integer comments_nid) {
        this.comments_nid = comments_nid;
    }

    public String getComments_uid() {
        return comments_uid;
    }

    public void setComments_uid(String comments_uid) {
        this.comments_uid = comments_uid;
    }

    public String getComments_context() {
        return comments_context;
    }

    public void setComments_context(String comments_context) {
        this.comments_context = comments_context;
    }

    public String getComments_time() {
        return comments_time;
    }

    public void setComments_time(String comments_time) {
        this.comments_time = comments_time;
    }
}
