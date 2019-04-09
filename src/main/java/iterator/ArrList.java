package iterator;

/***
 *
 *@Author ChenjunWang
 *@Description:
 *@Date: Created in 16:07 2018/4/7
 *@Modified By:
 *
 */
public class ArrList<T> {

    Object[] list;


    int size;
    public  ArrList(){
        size = 0;
        list = new Object[10];
    }
    public void add(T o){
        list[size++] = o;
    }

    public Iterator<T> iterator(){
        return new MyIterator();
    }

    public class MyIterator implements Iterator<T>{

        int index = 0;
        @Override
        public boolean hasNext() {
            if (index < size){
                return true;
            }
            return false;

        }

        @Override
        public T next() {

            return (T) list[index++];
        }
    }
}
