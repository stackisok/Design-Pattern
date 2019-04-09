package iterator;


/***
 *
 *@Author ChenjunWang
 *@Description:
 *@Date: Created in 23:56 2018/4/7
 *@Modified By:
 *
 */
public class Test {
    public static void main(String[] args) {
        ArrList<String> list = new ArrList<>();
        list.add("1");
        list.add("2");


        Iterator<String> iterator = list.iterator();

        System.out.println("迭代器开始");
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);

        }
        System.out.println("迭代器结束");
    }

}
