package bridge.usepattern;

/***
 *
 *@Author ChenjunWang
 *@Description:
 *@Date: Created in 22:44 2018/3/24
 *@Modified By:
 *
 */
abstract class Computer {
    private OperationSystem OS;
    public void setOS(OperationSystem OS){
        this.OS = OS;
    }
    abstract void detail();
    public void operation(){
        OS.operation();
    }
}
