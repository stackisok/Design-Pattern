package composite.notsafe;

/***
 *
 *@Author ChenjunWang
 *@Description:
 *@Date: Created in 21:35 2018/3/29
 *@Modified By:
 *
 */
public class Leaf extends Component{

    public Leaf(int val){
        this.val = val;
    }

    @Override
    public void add(Component component) {

    }

    @Override
    public void remove(Component component) {

    }

    @Override
    public void show() {

        System.out.println(val);
    }
}
