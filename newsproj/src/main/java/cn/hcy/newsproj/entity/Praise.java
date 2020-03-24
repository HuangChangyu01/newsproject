package cn.hcy.newsproj.entity;

public class Praise {
//    private Integer praise_id;
    private Integer praise_nid;
    private Integer praise_number;

    @Override
    public String toString() {
        return "Praise{" +
//                "praise_id=" + praise_id +
                ", praise_nid=" + praise_nid +
                ", praise_number=" + praise_number +
                '}';
    }

//    public Integer getPraise_id() {
//        return praise_id;
//    }
//
//    public void setPraise_id(Integer praise_id) {
//        this.praise_id = praise_id;
//    }

    public Integer getPraise_nid() {
        return praise_nid;
    }

    public void setPraise_nid(Integer praise_nid) {
        this.praise_nid = praise_nid;
    }

    public Integer getPraise_number() {
        return praise_number;
    }

    public void setPraise_number(Integer praise_number) {
        this.praise_number = praise_number;
    }
}
