package DesignPattern.Facade;

public class Projector {

    // 使用单例模式，使用饿汉式
    private static Projector instance = new Projector();

    public static Projector getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("projector on");
    }

    public void off() {
        System.out.println("projector off");
    }

    public void focus() {
        System.out.println("projector is focusing");
    }

}
