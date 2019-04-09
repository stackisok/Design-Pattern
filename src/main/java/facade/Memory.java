package facade;

/***
 *
 *@Author ChenjunWang
 *@Description:内存类
 *@Date: Created in 17:20 2018/3/26
 *@Modified By:
 *
 */
public class Memory {
    public void write() {
        System.out.println("写入内存……");
    }
    public void read() {
        System.out.println("读取内存……");
    }
    public void colse(){
        System.out.println("断开内存电源");
    }
}
