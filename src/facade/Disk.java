package facade;

/***
 *
 *@Author ChenjunWang
 *@Description:磁盘类
 *@Date: Created in 17:19 2018/3/26
 *@Modified By:
 *
 */
public class Disk {
    public void read() {
        System.out.println("磁盘开始读取数据……");
    }
    public void write() {
        System.out.println("磁盘开始写入数据……");
    }
    public void colse(){
        System.out.println("断开磁盘电源");
    }
}
