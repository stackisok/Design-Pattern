package flyweight;

import java.util.LinkedList;
import java.util.List;

/***
 *
 *@Author ChenjunWang
 *@Description:
 *@Date: Created in 19:36 2018/3/18
 *@Modified By:
 *
 */
public class CompositeSword extends Sword {
    private List<Sword> swordList = new LinkedList<>();
    public CompositeSword(){
        super();

    }
    public void add(Sword sword){
        swordList.add(sword);
    }

    public void attack(List<Integer> Durability) {

        for (int i = 0; i < swordList.size(); i++){
            System.out.println("耐久度为"+ Durability.get(i) + "实际攻击力为：" + swordList.get(i).attack(Durability.get(i)));
        }
    }
}
