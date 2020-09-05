package DesignPattern.Prototype.improve;

public class Client {

    public static void main(String[] args) {
        System.out.println("使用原型模式完成对象的创建");
        Sheep sheep = new Sheep("tom", 1, "白色");
        sheep.friend = new Sheep("jack", 2, "黑色");
        Sheep sheep1 = (Sheep) sheep.clone(); // 克隆
        Sheep sheep2 = (Sheep) sheep.clone(); // 克隆
        Sheep sheep3 = (Sheep) sheep.clone(); // 克隆
        Sheep sheep4 = (Sheep) sheep.clone(); // 克隆
        System.out.println(sheep);
        System.out.println(sheep1 + "  " + sheep.friend.hashCode());
        System.out.println(sheep2 + "  " + sheep.friend.hashCode());
        System.out.println(sheep3 + "  " + sheep.friend.hashCode());
        System.out.println(sheep4 + "  " + sheep.friend.hashCode());
    }

}
