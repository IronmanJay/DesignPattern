package DesignPattern.Factory.simplefactory.pizzastore.order;

import DesignPattern.Factory.simplefactory.pizzastore.pizza.CheesePizza;
import DesignPattern.Factory.simplefactory.pizzastore.pizza.GreekPizza;
import DesignPattern.Factory.simplefactory.pizzastore.pizza.PapperPizza;
import DesignPattern.Factory.simplefactory.pizzastore.pizza.Pizza;

// 简单工厂类
public class SimpleFactory {

    // 根据orderType返回对应的Pizza对象
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        System.out.println("使用简单工厂模式");
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName("奶酪披萨");
        } else if (orderType.equals("papper")) {
            pizza = new PapperPizza();
            pizza.setName("胡椒披萨");
        }
        return pizza;
    }

    // 简单工厂模式也叫静态工厂模式
    public static Pizza createPizza2(String orderType) {
        Pizza pizza = null;
        System.out.println("使用简单工厂模式");
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName("奶酪披萨");
        } else if (orderType.equals("papper")) {
            pizza = new PapperPizza();
            pizza.setName("胡椒披萨");
        }
        return pizza;
    }

}
