package prototype.compare;

/***
 *
 *@Author ChenjunWang
 *@Description:
 *@Date: Created in 10:44 2018/3/21
 *@Modified By:
 *
 */
public class DeepCopy implements Cloneable{
    public String attribute1;
    public String attribute2;
    public DeepCopy(){
        for (int i = 0; i < 10000; i++){
            this.attribute1 = "" + i;
        }

    }
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
