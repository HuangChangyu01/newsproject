package cn.hcy.newsproj.entity;

import java.util.List;

/**
 * 新闻表实体类
 */
public class News {
    private Integer news_id;
    private String news_title;
    private String news_attribute;
    private String news_image;
    private String news_content;
    private String news_time;
    private String news_source;
    private Integer commentsNumber; //评论数量
    private Praise praise;  // 点赞数
    private Integer enshrine; //收藏数量
    private List<comments> comments2;//评论内容详情

    public List<comments> getComments2() {
        return comments2;
    }

    public void setComments2(List<comments> comments2) {
        this.comments2 = comments2;
    }

    @Override
    public String toString() {
        return "News{" +
                "news_id=" + news_id +
                ", news_title='" + news_title + '\'' +
                ", news_attribute='" + news_attribute + '\'' +
                ", news_image='" + news_image + '\'' +
                ", news_content='" + news_content + '\'' +
                ", news_time='" + news_time + '\'' +
                ", news_source='" + news_source + '\'' +
                '}';
    }

    public Integer getEnshrine() {
        return enshrine;
    }

    public void setEnshrine(Integer enshrine) {
        this.enshrine = enshrine;
    }

    public Praise getPraise() {
        return praise;
    }

    public void setPraise(Praise praise) {
        this.praise = praise;
    }

    public Integer getCommentsNumber() {
        return commentsNumber;
    }

    public void setCommentsNumber(Integer commentsNumber) {
        this.commentsNumber = commentsNumber;
    }

    public Integer getNews_id() {
        return news_id;
    }

    public void setNews_id(Integer news_id) {
        this.news_id = news_id;
    }

    public String getNews_title() {
        return news_title;
    }

    public void setNews_title(String news_title) {
        this.news_title = news_title;
    }

    public String getNews_attribute() {
        return news_attribute;
    }

    public void setNews_attribute(String news_attribute) {
        this.news_attribute = news_attribute;
    }

    public String getNews_image() {
        return news_image;
    }

    public void setNews_image(String news_image) {
        this.news_image = news_image;
    }

    public String getNews_content() {
        return news_content;
    }

    public void setNews_content(String news_content) {
        this.news_content = news_content;
    }

    public String getNews_time() {
        return news_time;
    }

    public void setNews_time(String news_time) {
        this.news_time = news_time;
    }

    public String getNews_source() {
        return news_source;
    }

    public void setNews_source(String news_source) {
        this.news_source = news_source;
    }
}
