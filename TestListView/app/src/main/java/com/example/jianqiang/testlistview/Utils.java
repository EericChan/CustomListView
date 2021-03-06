package com.example.jianqiang.testlistview;

import java.util.ArrayList;
import java.util.List;

public class Utils {
    public static List<News> generateData() {
        List<News> newsList = new ArrayList<News>();

        newsList.add(genNew1());
        newsList.add(genNew2());
        newsList.add(genNew3());
        newsList.add(genNew4());
        newsList.add(genNew5());
        newsList.add(genNew6());
        newsList.add(genNew7());
        newsList.add(genNew8());
        newsList.add(genNew9());


        return newsList;
    }

    static News genNew1() {
        List<Comment> commentList1 = new ArrayList<Comment>();
        commentList1.add(new Comment("希区柯克", "有你真好"));
        commentList1.add(new Comment("小鱼儿 回复 希区柯克", "我是天才"));
        commentList1.add(new Comment("包建强", "咸鱼翻身！"));

        News news1 = new News();
        news1.author = "小鱼儿";
        news1.avator = "https://pic.cnblogs.com/face/313471/20141107134952.png";
        news1.content = "毕业蓝翔技校，技能搬运工！专门搜集生活中的实用小技能、小智慧，为您的生活提供更多帮助与便利。";
        news1.showtime = "1小时前";
        news1.commentList = commentList1;

        return news1;
    }

    static News genNew2() {
        List<Comment> commentList1 = new ArrayList<Comment>();
        commentList1.add(new Comment("阿轲", "背后攻击加倍伤害"));
        commentList1.add(new Comment("孙尚香 回复 阿轲", "来一个肉"));
        commentList1.add(new Comment("太乙真人", "我游走！"));

        News news1 = new News();
        news1.author = "太乙真人";
        news1.avator = "https://pic.cnblogs.com/face/605230/20170228090302.png";
        news1.content = "王者荣耀走起";
        news1.showtime = "2小时前";
        news1.preferList = new String[]{"高渐离", "张飞", "不知火舞"};
        news1.commentList = commentList1;

        return news1;
    }

    static News genNew3() {
        List<Comment> commentList1 = new ArrayList<Comment>();
        commentList1.add(new Comment("李四", "80分走起"));
        commentList1.add(new Comment("石头回复李四", "避风塘吧"));
        commentList1.add(new Comment("王二麻子", "谁跟我对家？"));

        News news1 = new News();
        news1.author = "张三";
        news1.avator = "https://pic.cnblogs.com/face/u383503.jpg?id=26222424";
        news1.content = "晚上团建";
        news1.showtime = "3小时前";
        news1.preferList = new String[]{"老爸", "老妈", "三姨"};
        news1.commentList = commentList1;

        return news1;
    }

    static News genNew4() {
        News news1 = new News();
        news1.author = "肉胖";
        news1.avator = "https://pic.cnblogs.com/face/433855/20130219085148.png";
        news1.content = "TCP/IP协议栈是一系列网络协议的总和，是构成网络通信的核心骨架";
        news1.showtime = "4小时前";
        news1.preferList = new String[]{"叶曲波", "起为", "郭刚"};

        return news1;
    }

    static News genNew5() {
        List<Comment> commentList1 = new ArrayList<Comment>();
        commentList1.add(new Comment("巴尔扎克", "写得不错"));
        commentList1.add(new Comment("雨果 回复 巴尔扎克", "送一套人间喜剧"));
        commentList1.add(new Comment("契诃夫", "来俄国，我请客！"));

        News news1 = new News();
        news1.author = "萨克雷";
        news1.avator = "https://pic.cnblogs.com/face/834468/20151115214952.png";
        news1.content = "名利场终于写完了";
        news1.showtime = "5小时前";
        news1.preferList = new String[]{"高尔斯华绥", "阿婆", "乔叟"};
        news1.commentList = commentList1;

        return news1;
    }

    static News genNew6() {
        List<Comment> commentList1 = new ArrayList<Comment>();
        commentList1.add(new Comment("小红帽", "蛋糕做得不错"));
        commentList1.add(new Comment("包建强 回复 小红帽", "谢谢夸奖"));
        commentList1.add(new Comment("大灰狼", "提拉米苏有吗？"));

        News news1 = new News();
        news1.author = "包建强";
        news1.avator = "https://pic.cnblogs.com/face/1118933/20170616222517.png";
        news1.content = "晒一下我的烘焙蛋糕";
        news1.showtime = "6小时前";
        news1.preferList = new String[]{"蛋糕达人", "白雪公主", "蓝精灵"};
        news1.commentList = commentList1;

        return news1;
    }


    static News genNew7() {
        List<Comment> commentList1 = new ArrayList<Comment>();
        commentList1.add(new Comment("杨逍", "忍着"));
        commentList1.add(new Comment("张无忌 回复 杨逍", "。。。"));
        commentList1.add(new Comment("朱元璋", "有痔疮贴肛泰！"));

        News news1 = new News();
        news1.author = "张无忌";
        news1.avator = "https://pic.cnblogs.com/face/250417/20160816172634.png";
        news1.content = "有痔疮怎么办？";
        news1.showtime = "7小时前";
        news1.preferList = new String[]{"周芷若", "赵敏", "小昭"};
        news1.commentList = commentList1;

        return news1;
    }

    static News genNew8() {
        List<Comment> commentList1 = new ArrayList<Comment>();
        commentList1.add(new Comment("李逵", "我想娶老婆！"));
        commentList1.add(new Comment("宋江 回复 李逵", "忍着！"));
        commentList1.add(new Comment("萧让", "我来写！"));

        News news1 = new News();
        news1.author = "宋江";
        news1.avator = "https://pic.cnblogs.com/face/1181291/20170629150910.png";
        news1.content = "105个男人和3个女人的故事";
        news1.showtime = "8小时前";
        news1.preferList = new String[]{"李逵", "卢俊义", "孙二娘"};
        news1.commentList = commentList1;

        return news1;
    }

    static News genNew9() {
        List<Comment> commentList1 = new ArrayList<Comment>();
        commentList1.add(new Comment("孙猴", "吃俺老孙一棒！"));
        commentList1.add(new Comment("老猪", "高老庄一日游"));
        commentList1.add(new Comment("老沙 回复", "大师兄，师父被妖怪抓走了～～"));

        News news1 = new News();
        news1.author = "唐僧";
        news1.avator = "https://pic.cnblogs.com/face/601535/20140621193541.png";
        news1.content = "骑白马的不一定是我～～";
        news1.showtime = "9小时前";
        news1.preferList = new String[]{"杨戬", "太上老君的那头牛", "玉皇大帝"};
        news1.commentList = commentList1;

        return news1;
    }
}