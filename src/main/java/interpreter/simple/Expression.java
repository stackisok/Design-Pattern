package interpreter.simple;

/***
 *
 *@Author ChenjunWang
 *@Description:解释器接口
 *@Date: Created in 16:20 2018/4/17
 *@Modified By:
 *
 */
public interface Expression {
    int interpreter(Context context);//一定会有解释方法
}
