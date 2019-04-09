package memento.black;

    /***
     *
     *@Author ChenjunWang
     *@Description:测试类
     *@Date: Created in 11:26 2018/4/18
     *@Modified By:
     *
     */
    public class Test {
        public static void main(String[] args) {

            Originator u486 = new Originator();
            Caretaker admin = new Caretaker();
            System.out.println("------------------486 来到了异世界----------------------");
            admin.saveMemento(u486.creatMementoObject());
            u486.setTime(100);
            System.out.println("------------------486 death----------------------");
            u486.restoreMemento(admin.retrieveMemento());
            System.out.println("-------------------从零开始-----------------------");
            System.out.println("486的时间变为：" + u486.getTime());

        }
    }
