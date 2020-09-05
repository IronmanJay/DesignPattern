package DesignPattern.Bridge;

// 直立式手机类，继承抽象类Phone
public class UpRightPhone extends Phone {

    // 构造器
    public UpRightPhone(Brand brand) {
        super(brand);
    }

    public void open() {
        super.open();
        System.out.println("直立样式手机");
    }

    public void close() {
        super.close();
        System.out.println("直立样式手机");
    }

    public void call() {
        super.call();
        System.out.println("直立样式手机");
    }

}
