package composite.notsafe;

import java.util.ArrayList;
import java.util.List;

/***
 *
 *@Author ChenjunWang
 *@Description:
 *@Date: Created in 21:36 2018/3/29
 *@Modified By:
 *
 */
public class Composite extends Component{
    List<Component> list = new ArrayList<>();

    public Composite(int val){
        this.val = val;
    }

    @Override
    public void add(Component component) {
        list.add(component);

    }

    @Override
    public void remove(Component component) {

        list.remove(component);
    }

    @Override
    public void show() {

        System.out.println(val);
        for (Component c : list){
            c.show();
        }

    }
}
