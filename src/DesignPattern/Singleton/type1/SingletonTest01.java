package DesignPattern.Singleton.type1;

public class SingletonTest01 {

    public static void main(String[] args) {
        // 测试
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1); // true
        System.out.println("instance.hashCode()=" + instance.hashCode());
        System.out.println("instance1.hashCode()=" + instance1.hashCode());
    }

}

// 饿汉式（静态变量）
class Singleton {
    // 1、构造器私有化，外部不能new
    private Singleton() {

    }

    // 2、本类内部创建对象实例
    private final static Singleton instance = new Singleton();

    // 3、提供一个共有的静态方法，返回实例对象
    public static Singleton getInstance() {
        return instance;
    }

}


