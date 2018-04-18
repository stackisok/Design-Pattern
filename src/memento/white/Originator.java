package memento.white;

/***
 *
 *@Author ChenjunWang
 *@Description:备忘录发起者，也是需要被备忘的对象
 *@Date: Created in 10:57 2018/4/18
 *@Modified By:
 *
 */
public class Originator {
    private int time = 0;//刚进入的时候，486的时间节点是0


    public Memento creatMementoObject() {
        return new Memento(time);
    }


    public void restoreMemento(Memento memento) {
        this.time = memento.getTime();

    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
