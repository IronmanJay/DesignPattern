package DesignPattern.Singleton.type7;

public class SingletonTest07 {

    public static void main(String[] args) {
        // 测试
        Singleton instance = Singleton.INSTANCE;
        Singleton instance1 = Singleton.INSTANCE;
        System.out.println(instance == instance1);
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
        instance.sayOK();
    }

}

// 使用枚举，可以实现单例，推荐使用
enum Singleton {
    INSTANCE; // 属性

    public void sayOK() {
        System.out.println("ok~");
    }
}
