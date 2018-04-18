package memento.white;

/***
 *
 *@Author ChenjunWang
 *@Description:看门人(负责备忘录的管理)
 *@Date: Created in 10:58 2018/4/18
 *@Modified By:
 *
 */
public class Caretaker {

    private Memento memento;

    //返回已保存的备忘录（用于恢复记录）
    public Memento retrieveMemento(){
        return this.memento;
    }


    //保存备忘录记录
    public void saveMemento(Memento memento) {
        this.memento = memento;
    }



}
