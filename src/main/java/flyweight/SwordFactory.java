package flyweight;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/***
 *
 *@Author ChenjunWang
 *@Description:
 *@Date: Created in 18:48 2018/3/18
 *@Modified By:
 *
 */
public class SwordFactory {
    private static Map<String,Sword> map = new HashMap<>();

    static Sword getSword(String s){

        Sword sword = map.get(s);
        if (sword != null)
            return sword;

        if (s.equals("wood"))
            sword = new WoodSword(10,"快","木头");
        else if (s.equals("iron"))
            sword = new IronSword(50,"较快","铁");

        if (sword == null)
            return null;
        map.put(s,sword);
        return sword;

    }


    static CompositeSword getComposite(List<String> list){

        CompositeSword compositeSword = new CompositeSword();
        for (String key : list){
            Sword sword = getSword(key);
            if (sword != null)
                compositeSword.add(sword);
        }

        return compositeSword;
    }

}
