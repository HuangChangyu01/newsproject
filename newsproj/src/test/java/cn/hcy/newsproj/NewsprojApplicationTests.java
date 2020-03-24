package cn.hcy.newsproj;

import cn.hcy.newsproj.entity.*;
import cn.hcy.newsproj.mapper.ICommentsMapper;
import cn.hcy.newsproj.mapper.IEnshrineMapper;
import cn.hcy.newsproj.mapper.IPraiseMapper;
import cn.hcy.newsproj.mapper.IReplyMapper;
import cn.hcy.newsproj.service.IEnshrineService;
import cn.hcy.newsproj.service.INewsService;
import cn.hcy.newsproj.service.IUserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.io.UnsupportedEncodingException;
import java.sql.SQLException;
import java.util.List;
import java.util.Random;

@SpringBootTest
class NewsprojApplicationTests {
    @Autowired
    DataSource dataSource;
    @Autowired
    INewsService serviceDao;
    @Autowired
    ICommentsMapper iCommentsMapper;
    @Autowired
    IPraiseMapper praiseMapper;
    @Autowired
    IEnshrineMapper enshrineMapper;
    @Autowired
    IUserService iUserService;


    @Test
    void contextLoads() throws SQLException {
//        System.out.println(dataSource.getClass());
//        Connection connection= dataSource.getConnection();
//        System.out.println(connection);
//        connection.close();
    }
    @Test
    void texe2(){
        int bb;

        List<News> aa=serviceDao.findNewsByattribute("头条");
        for(News u:aa){
            bb=u.getPraise()==null? 0:u.getPraise().getPraise_number();
            System.out.println("题目:"+" "+u.getNews_title());
            System.out.println("评论数量:"+" "+u.getCommentsNumber());
            System.out.println("点赞数量:"+" "+bb);
            System.out.println("收藏数量:"+" "+u.getEnshrine());
            System.out.println("评论详情"+" "+u.getComments2());
            System.out.println("-------------");
        }
    }
    @Test
    void text3(){
        System.out.println(praiseMapper.findPraiseNumber(3));
    }
    @Test
    void text4(){
        System.out.println(enshrineMapper.findByEnshrineNumber(22));
    }
    @Test
    void  text5(){
        List<comments> aa=iCommentsMapper.findCommentsbyId(1);
        for(comments u:aa){
            System.out.println(u);
            System.out.println(u.getUser1());
            System.out.println("---------------");
        }
    }
    @Test
    void text6(){
        int bb;
        News u=serviceDao.findNewsById(1);
            bb=u.getPraise()==null? 0:u.getPraise().getPraise_number();
            System.out.println("题目:"+" "+u.getNews_title());
            System.out.println("评论数量:"+" "+u.getCommentsNumber());
            System.out.println("点赞数量:"+" "+bb);
            System.out.println("收藏数量:"+" "+u.getEnshrine());

            for(comments cc:u.getComments2()){
                System.out.println("评论详情"+" "+cc.getComments_context());
                System.out.println("用户详情"+" "+cc.getUser1());
//                cc.getReplies();
            }
            System.out.println("-------------");

    }

    @Test
    void text7(){
//        user uu=iUserService.findUser("12334");
//        System.out.println(uu);
        user uu2=iUserService.login("123545","123");
        System.out.println(uu2);
    }

    @Autowired
    IEnshrineService iEnshrineService;
    @Test
    void text8(){
          Enshrine enshrine= iEnshrineService.findByEnshrine(1,"123");
          System.out.println(enshrine);
    }
    @Autowired
    IReplyMapper iReplyMapper;
    @Test
    void text9(){
//        List<Reply> replies=iReplyMapper.fingReplyById(1);
//        for(Reply a:replies){
//            System.out.println(a);
//            System.out.println(a.getUser1());
//        }
        List<comments> comments22=iCommentsMapper.findCommentsbyId(1);
        for(comments aa:comments22){
            System.out.println("主评论："+aa);
            System.out.println("主评论评论用户的信息："+aa.getUser1());
            for(Reply vv:aa.getReplies()){
                System.out.println("回复评论的信息："+vv);
                System.out.println("回复评论用户的信息："+vv.getUser1());
            }
            System.out.println("----------");
        }

    }

    @Test
    void text10(){
       List<Enshrine> list=enshrineMapper.findByUid("123");
       for(Enshrine aa:list){
           System.out.println(aa);
//           System.out.println(aa.getNews());
             aa.getEnshrine_nid();

       }
    }
    @Test
    void  text11(){
        Random ran = new Random();
        final  int delta = 0x9fa5 - 0x4e00 + 1;
        char a=(char)(0x4e00 + ran.nextInt(delta));
        String  aa= a+"";
        System.out.println(aa);
       /* String str = null;
        int hs, ls;
        Random random = new Random();
        hs = (176 + Math.abs(random.nextInt(39)));
        ls = (161 + Math.abs(random.nextInt(93)));
        byte[] b = new byte[2];
        b[0] = (new Integer(hs).byteValue());
        b[1] = (new Integer(ls).byteValue());
        try {
            str = new String(b, "GBk"); //转成中文
            System.out.println(str);;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }*/
    }

}
