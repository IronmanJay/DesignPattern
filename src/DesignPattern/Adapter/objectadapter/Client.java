package DesignPattern.Adapter.objectadapter;

public class Client {

    public static void main(String[] args) {
        System.out.println("====对象适配器模式====");
        Phone phone = new Phone();
        phone.charging(new VlotageAdapter(new Voltage220V()));
    }

}
