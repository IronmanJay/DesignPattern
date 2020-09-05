package DesignPattern.Facade;

public class TheaterLight {

    // 使用单例模式，使用饿汉式
    private static TheaterLight instance = new TheaterLight();

    public static TheaterLight getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("theaterLight on");
    }

    public void off() {
        System.out.println("theaterLight off");
    }

    public void dim() {
        System.out.println("theaterLight dim");
    }

    public void bright() {
        System.out.println("theaterLight bright");
    }

}
