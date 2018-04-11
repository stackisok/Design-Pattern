package observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/***
 *
 *@Author ChenjunWang
 *@Description: 银行叫号中心
 *@Date: Created in 17:06 2018/4/11
 *@Modified By:
 *
 */
public class BankCallCenter implements Subject {
    List<Observer> list = new ArrayList<>();
    @Override
    public void registerObserver(Observer observer) {

        list.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {

        list.remove(observer);
    }

    @Override
    public void notifyObserver(String msg) {


        for (Observer item : list)
            item.update(msg);
    }
}
