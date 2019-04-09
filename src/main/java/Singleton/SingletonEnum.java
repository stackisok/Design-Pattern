package Singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public enum SingletonEnum {
    SINGLETON;

    public SingletonEnum getInstance() {
        return SINGLETON;
    }

    private static void reflection() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        SingletonEnum singleton = SingletonEnum.SINGLETON;
        Constructor constructor = null;
        constructor = SingletonEnum.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Object singleton2 = null;
        singleton2 = constructor.newInstance();
        System.out.println("通过反射得到的单例是否相同：" + (singleton == singleton2));
    }
    private static void Serializable() throws IOException, ClassNotFoundException {
        SingletonEnum singleton = SingletonEnum.SINGLETON;
        String path = SingletonEnum.class.getResource("").getPath() + "singleton.obj";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
        oos.writeObject(singleton);
        oos.flush();
        oos.close();

        FileInputStream fis = new FileInputStream(path);
        ObjectInputStream ois = new ObjectInputStream(fis);
        SingletonEnum singleton2 = (SingletonEnum)ois.readObject();
        ois.close();
        System.out.println("枚举序列化前后是否为同一个对象："+(singleton == singleton2));
    }

    public static void main(String[] args) {
        try {
            Serializable();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
