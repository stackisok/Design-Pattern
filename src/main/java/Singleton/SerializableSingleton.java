package Singleton;

import java.io.*;

public class SerializableSingleton implements Serializable {
    private static final long serialVersionUID = 1L;
    private static SerializableSingleton singleton;

    public SerializableSingleton() {
        if (singleton != null) {
            throw new RuntimeException("单例不允许修改");
        }
    }

    public static SerializableSingleton getSingleton() {
        if (singleton == null) {
            synchronized (SerializableSingleton.class) {
                //进来后再进行一次判断
                if (singleton == null) {
                    singleton = new SerializableSingleton();
                }
            }
        }
        return singleton;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SerializableSingleton singleton = null;
        SerializableSingleton singleton1 = SerializableSingleton.getSingleton();
        String path = SerializableSingleton.class.getResource("").getPath() + "singleton.obj";

        FileOutputStream fos = new FileOutputStream(path);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(singleton1);
        oos.flush();
        oos.close();

        FileInputStream fis = new FileInputStream(path);
        ObjectInputStream ois = new ObjectInputStream(fis);
        singleton = (SerializableSingleton) ois.readObject();
        System.out.println(singleton1 == singleton);
    }

    private Object readResolve() {
        return singleton;
    }
}
