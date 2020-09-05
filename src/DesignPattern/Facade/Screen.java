package DesignPattern.Facade;

public class Screen {

    // 使用单例模式，使用饿汉式
    private static Screen instance = new Screen();

    public static Screen getInstance() {
        return instance;
    }

    public void up() {
        System.out.println("screen up");
    }

    public void down() {
        System.out.println("screen down");
    }

}
