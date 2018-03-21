package flyweight;

import java.util.ArrayList;
import java.util.List;

/***
 *
 *@Author ChenjunWang
 *@Description:
 *@Date: Created in 18:47 2018/3/18
 *@Modified By:
 *
 */
public class Test {
    public static void main(String[] args) {
        Sword woodSword = SwordFactory.getSword("wood");
        System.out.println("耐久度为100时,实际攻击力为：" + woodSword.attack(100));

        Sword woodSword2 = SwordFactory.getSword("wood");
        System.out.println("耐久度为50时,实际攻击力为：" + woodSword2.attack(50));

        System.out.println("woodSword 和 woodSword2 是否是同一个对象？" + (woodSword == woodSword2));

        List<String> list = new ArrayList<>();
        list.add("wood");
        list.add("wood");
        CompositeSword composite = SwordFactory.getComposite(list);
        List<Integer> d = new ArrayList<>();
        d.add(100);
        d.add(50);
        composite.attack(d);

    }
}
