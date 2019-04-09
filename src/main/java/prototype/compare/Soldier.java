package prototype.compare;

/***
 *
 *@Author ChenjunWang
 *@Description:
 *@Date: Created in 10:23 2018/3/21
 *@Modified By:
 *
 */
public class Soldier implements Cloneable{
    public Integer hp;
    public int mp;
    public String name;
    public DeepCopy deepCopy;
    public Object clone() {
        Object clone = null;
        Soldier clone1 = null;
        try {
            clone = super.clone();
            clone1 = (Soldier) clone;
            clone1.deepCopy = (DeepCopy) this.deepCopy.clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone1;
    }
}
