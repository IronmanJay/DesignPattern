package DesignPattern.Factory.factorymethod.pizzastore.order;


import DesignPattern.Factory.factorymethod.pizzastore.pizza.BJCheesePizza;
import DesignPattern.Factory.factorymethod.pizzastore.pizza.BJPapperPizza;
import DesignPattern.Factory.factorymethod.pizzastore.pizza.Pizza;

public class BJOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")){
            pizza = new BJCheesePizza();
        }else if(orderType.equals("papper")){
            pizza = new BJPapperPizza();
        }
        return pizza;
    }
}
