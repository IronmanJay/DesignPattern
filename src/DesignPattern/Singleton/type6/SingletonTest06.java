package DesignPattern.Singleton.type6;

public class SingletonTest06 {

    public static void main(String[] args) {
        // 测试
        System.out.println("使用静态内部类完成单例模式");
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1); // true
        System.out.println("instance.hashCode()=" + instance.hashCode());
        System.out.println("instance1.hashCode()=" + instance1.hashCode());
    }

}

// 静态内部类完成，推荐使用
class Singleton {

    private static volatile Singleton instance;

    // 构造器私有化
    private Singleton() {

    }

    // 写一个静态内部类，该类中有一个静态属性Singleton
    private static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }

    // 提供一个静态的公有方法，直接返回SingletonInstance.INSTANCE
    public static synchronized Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }

}
