package DesignPattern.Principle.Inversion.improve;

public class DependencyInversion2 {

    public static void main(String[] args) {
        // 客户端无需改变
        Person person = new Person();
        person.receive(new Email());
        person.receive(new WeiXin());
    }

}

// 定义一个接口
interface IReceiver {
    public String getInfo();
}

class Email implements IReceiver {

    public String getInfo() {
        return "电子邮件信息：hello world";
    }

}

// 增加微信
class WeiXin implements IReceiver {
    public String getInfo() {
        return "微信信息：hello ok";
    }
}

// 方式2
class Person {
    // 这里是对接口的依赖
    public void receive(IReceiver receiver) {
        System.out.println(receiver.getInfo());
    }
}
