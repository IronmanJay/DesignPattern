package DesignPattern.Visitor;

public class Client {

    public static void main(String[] args) {
        // 创建ObjectStructure
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.attach(new Man());
        objectStructure.attach(new Woman());
        // 成功
        Success success = new Success();
        objectStructure.display(success);
        System.out.println("=======================");
        // 失败
        Fail fail = new Fail();
        objectStructure.display(fail);
        System.out.println("=======================");
        // 待定
        Wait wait = new Wait();
        objectStructure.display(wait);
    }

}
