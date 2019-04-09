package visitor;

/***
 *
 *@Author ChenjunWang
 *@Description:具体访问物接口
 *@Date: Created in 17:45 2018/4/12
 *@Modified By:
 *
 */
public interface Node {
    //这里是动态分派，接口类不好体现。我们看下结构类
    void accept(Visitor visitor);
}
