package DesignPattern.Singleton.type3;

public class SingletonTest03 {

    public static void main(String[] args) {
        // 测试
        System.out.println("懒汉式1，线程不安全");
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1); // true
        System.out.println("instance.hashCode()=" + instance.hashCode());
        System.out.println("instance1.hashCode()=" + instance1.hashCode());
    }

}

class Singleton {

    private static Singleton instance;

    private Singleton() {

    }

    // 提供一个静态的公有方法，当使用到该方法时，才去创建instance，即懒汉式
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}
