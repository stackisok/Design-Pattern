package observer;

/***
 *
 *@Author ChenjunWang
 *@Description:被观察者接口
 *@Date: Created in 16:11 2018/4/11
 *@Modified By:
 *
 */
public interface Subject {
    //注册观察者
    void registerObserver(Observer observer);
    //移除观察者
    void removeObserver(Observer observer);
    //提醒观察者
    void notifyObserver(String msg);
}
