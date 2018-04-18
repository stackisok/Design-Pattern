package memento.black;

/***
 *
 *@Author ChenjunWang
 *@Description:
 *@Date: Created in 10:57 2018/4/18
 *@Modified By:
 *
 */
public class Originator {
    private int time = 0;


    public IMemento creatMementoObject() {
        return new Memento(time);
    }


    public void restoreMemento(IMemento memento) {
        this.time = ((Memento)memento).getTime();

    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    private  class Memento implements IMemento{
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


}
