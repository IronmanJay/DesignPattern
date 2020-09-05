package DesignPattern.Principle.Liskov;

public class Liskov1 {

    public static void main(String[] args) {
        A a = new A();
        System.out.println("11-3=" + a.func1(11, 3));
        System.out.println("1-8=" + a.func1(1, 8));
        System.out.println("-----------------------");
        B b = new B();
        System.out.println("11-3=" + b.func1(11, 3)); // 本意是求11-3的结果
        System.out.println("1-8=" + b.func1(1, 8)); // 本意是求1-8的结果
        System.out.println("11+3+9=" + b.func2(11, 3));
    }

}

// A类
class A {
    // 返回两个数的差
    public int func1(int num1, int num2) {
        return num1 - num2;
    }
}

// B类继承了A类
// 增加了一个新的功能：完成两个数相加，然后和9求和
class B extends A {
    // 这里重写了A类的方法，可能是无意识
    @Override
    public int func1(int a, int b) {
        return a + b;
    }

    public int func2(int a, int b) {
        return func1(a, b) + 9;
    }
}
