package composite.safe;

/***
 *
 *@Author ChenjunWang
 *@Description:
 *@Date: Created in 21:35 2018/3/29
 *@Modified By:
 *
 */
public class Leaf extends Component {

    public Leaf(int val){
        this.val = val;
    }


    @Override
    public void show() {

        System.out.println(val);
    }
}
