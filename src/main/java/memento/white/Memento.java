package memento.white;

/***
 *
 *@Author ChenjunWang
 *@Description:备忘录模板（要返回的记录以这个格式保存）
 *@Date: Created in 10:57 2018/4/18
 *@Modified By:
 *
 */
public class Memento {
    private int time;
    public Memento(int time) {
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
