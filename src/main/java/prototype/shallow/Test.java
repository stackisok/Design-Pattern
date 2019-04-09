package prototype.shallow;

import prototype.deep.DeepCopy;


/***
 *
 *@Author ChenjunWang
 *@Description:
 *@Date: Created in 10:24 2018/3/21
 *@Modified By:
 *
 */
public class Test {
    public static void main(String[] args) {
        Soldier soldier = new Soldier();
        soldier.hp = new Integer(5000);
        soldier.mp = 1;
        soldier.name = "1";
        soldier.deepCopy = new DeepCopy();
        soldier.deepCopy.attribute1 = "attribute1";


        Soldier cloneSoldier = (Soldier)soldier.clone();
        System.out.println("原始士兵的deepCopy的attribute1的值：" + soldier.deepCopy.attribute1);

        System.out.println("克隆对象的deepCopy的attribute1的值：" + cloneSoldier.deepCopy.attribute1);

        cloneSoldier.deepCopy.attribute1 = "changeAttribute";
        System.out.println("修改克隆对象的deepCopy的attribute1的值后，原始士兵的deepCopy的attribute1值：" + soldier.deepCopy.attribute1);
        System.out.println("修改克隆对象的deepCopy的attribute1的值后，克隆对象的deepCopy的attribute1值：" + cloneSoldier.deepCopy.attribute1);

    }
}
