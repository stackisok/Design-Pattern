package prototype.compare;


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
        soldier.hp = 1;
        soldier.mp = 1;
        soldier.name = "1";
        soldier.deepCopy = new DeepCopy();

        long begin = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++){
            Soldier soldier1 = new Soldier();
            soldier1.deepCopy = new DeepCopy();
        }
        long end = System.currentTimeMillis();
        System.out.println("新建10000个对象耗时：" + (end - begin));


        begin = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++){

            soldier.clone();
        }
        end = System.currentTimeMillis();
        System.out.println("克隆10000个对象耗时：" + (end - begin));

    }
}
