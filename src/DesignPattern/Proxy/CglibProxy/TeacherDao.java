package DesignPattern.Proxy.CglibProxy;

public class TeacherDao {

    public String teach() {
        System.out.println("老师授课中，我是Cglib代理，不需要实现接口");
        return "hello";
    }

}
