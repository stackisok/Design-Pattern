package chainOfResponsibility;

/***
 *
 *@Author ChenjunWang
 *@Description:要被处理的对象，这里是投诉类
 *@Date: Created in 17:38 2018/4/16
 *@Modified By:
 *
 */
public class Complain {
    private int level;//投诉的等级，处理对象靠这个字段来判断是否能处理
    private String content;
    public Complain(int level, String content){
        this.level = level;
        this.content = content;
    }

    public int getLevel() {
        return level;
    }

    public String getContent() {
        return content;
    }
}
