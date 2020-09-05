package DesignPattern.Decorator;

public class Decorator extends Drink {

    private Drink obj;

    public Decorator(Drink obj) { // 组合
        this.obj = obj;
    }

    @Override
    public float cost() {
        // super.getPrice()是自己的价格
        return super.getPrice() + obj.cost();
    }

    @Override
    public String getDes() {
        // obj.getDes()输出被装饰者的信息
        return super.des + " " + super.getPrice() + " && " + obj.getDes();
    }
}
