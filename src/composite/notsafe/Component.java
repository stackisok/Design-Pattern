package composite.notsafe;

/***
 *
 *@Author ChenjunWang
 *@Description:
 *@Date: Created in 21:27 2018/3/29
 *@Modified By:
 *
 */
public abstract class Component {
    int val;
    public abstract void add(Component component);
    public abstract void remove(Component component);

    public abstract void show();
    
}
