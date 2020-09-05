package DesignPattern.Decorator;

public class CoffeeBar {

    public static void main(String[] args) {
        // 装饰者模式下订单：2份巧克力+一份牛奶的LongBlack
        // 1、点一份LongBlack
        Drink order = new LongBlack();
        System.out.println("LongBlack原始费用=" + order.cost());
        System.out.println("LongBlack原始描述=" + order.getDes());
        // 2、LongBlack加入一份牛奶
        order = new Milk(order);
        System.out.println("LongBlack加入一份牛奶后费用=" + order.cost());
        System.out.println("LongBlack加入一份牛奶后描述=" + order.getDes());
        // 3、LongBlack加入一份巧克力
        order = new Chocolate(order);
        System.out.println("LongBlack加入一份牛奶+巧克力后费用=" + order.cost());
        System.out.println("LongBlack加入一份牛奶+巧克力后描述=" + order.getDes());
        // 4、LongBlack加入第二份份巧克力
        order = new Chocolate(order);
        System.out.println("LongBlack加入两份牛奶+巧克力后费用=" + order.cost());
        System.out.println("LongBlack加入两份牛奶+巧克力后描述=" + order.getDes());
        // 加入一个新的无因咖啡类
        System.out.println("================================================================================");
        Drink order2 = new Decaf();
        System.out.println("Decaf原始费用=" + order2.cost());
        System.out.println("Decaf原始描述=" + order2.getDes());
        // 5、Decaf加入牛奶
        order2 = new Milk(order2);
        System.out.println("Decaf加入一份牛奶后费用=" + order2.cost());
        System.out.println("Decaf加入一份牛奶后描述=" + order2.getDes());
    }

}
