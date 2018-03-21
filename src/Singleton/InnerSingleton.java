package Singleton;

public class InnerSingleton {
    private static class SingletonHelp {
        static Test instance = new Test("1");
    }

    public static Test getInstance() {
        return SingletonHelp.instance;
    }

    public static void main(String[] args) {
        System.out.println(12);
        Test instance = SingletonHelp.instance;
    }
}
