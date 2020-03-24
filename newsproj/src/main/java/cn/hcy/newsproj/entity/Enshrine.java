package cn.hcy.newsproj.entity;

public class Enshrine {
    private Integer enshrine_nid;
    private String enshrine_uid;
    private News news;

    public News getNews() {
        return news;
    }

    public void setNews(News news) {
        this.news = news;
    }

    @Override
    public String toString() {
        return "Enshrine{" +
                "enshrine_nid=" + enshrine_nid +
                ", enshrine_uid='" + enshrine_uid + '\'' +
                '}';
    }

    public Integer getEnshrine_nid() {
        return enshrine_nid;
    }

    public void setEnshrine_nid(Integer enshrine_nid) {
        this.enshrine_nid = enshrine_nid;
    }

    public String getEnshrine_uid() {
        return enshrine_uid;
    }

    public void setEnshrine_uid(String enshrine_uid) {
        this.enshrine_uid = enshrine_uid;
    }
}
