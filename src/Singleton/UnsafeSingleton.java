package Singleton;


public class UnsafeSingleton {

    private static UnsafeSingleton unsafeSingleton;
    public static synchronized UnsafeSingleton getUnsafeSingleton(){
        if (unsafeSingleton == null)
            unsafeSingleton = new UnsafeSingleton();

        return unsafeSingleton;
    }

}
