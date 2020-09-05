package DesignPattern.Factory.simplefactory.pizzastore.pizza;

public class PapperPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("给制作胡椒披萨准备原材料");
    }
}
