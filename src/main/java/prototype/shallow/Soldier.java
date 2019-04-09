package prototype.shallow;

import prototype.deep.DeepCopy;

/***
 *
 *@Author ChenjunWang
 *@Description:
 *@Date: Created in 14:27 2018/3/21
 *@Modified By:
 *
 */
public class Soldier implements Cloneable{

    /**
     * 我们需要创建大量的士兵的话，传统的方法是我们需要不停的new出来对象，但是假如new对象的创建过程非常耗时的话，那么我们就要花费大量的时间在创建对象上了，那这部分时间我们能不能省下来呢？答案就在原型模式上
     */
    Integer hp;
    int mp;
    String name;
    DeepCopy deepCopy;
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
