package DesignPattern.Strategy.improve;

public class Client {

    public static void main(String[] args) {
        System.out.println("野鸭：");
        WildDuck wildDuck = new WildDuck();
        wildDuck.fly();
        System.out.println("玩具鸭：");
        ToyDuck toyDuck = new ToyDuck();
        toyDuck.fly();
        System.out.println("北京鸭：");
        PekingDuck pekingDuck = new PekingDuck();
        pekingDuck.fly();
        // 动态改变某个对象的行为，假设北京鸭不能飞翔
        pekingDuck.setFlyBehavior(new NoFlyBehavior());
        System.out.println("北京鸭的实际飞翔能力：");
        pekingDuck.fly();
    }

}
