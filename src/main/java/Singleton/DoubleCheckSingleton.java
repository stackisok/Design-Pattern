package Singleton;

import java.lang.reflect.Field;

public class DoubleCheckSingleton {
    private static DoubleCheckSingleton singleton;

    public DoubleCheckSingleton() {
        if (singleton != null) {
            throw new RuntimeException("单例不允许修改");
        }
    }

    public static DoubleCheckSingleton getSingleton() {
        if (singleton == null) {
            synchronized (DoubleCheckSingleton.class) {
                //进来后再进行一次判断
                if (singleton == null) {
                    singleton = new DoubleCheckSingleton();
                }
            }
        }
        return singleton;
    }

    public static void changeSingleton() {
        System.out.println(getSingleton());
        try {
            Field unsafeSingleton = DoubleCheckSingleton.class.getDeclaredField("singleton");
            unsafeSingleton.set(DoubleCheckSingleton.singleton, new DoubleCheckSingleton());
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println(getSingleton());

    }
    public static void main(String[] args) {
        changeSingleton();
    }
}
