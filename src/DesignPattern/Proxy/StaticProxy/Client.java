package DesignPattern.Proxy.StaticProxy;

public class Client {

    public static void main(String[] args) {
        // 创建目标对象，被代理对象
        TeacherDao teacherDao = new TeacherDao();
        // 创建代理对象，同时将被被代理对象传给代理对象
        TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(teacherDao);
        // 通过代理对象，调用被代理对象的方法
        // 即：执行的是代理对象的方法，代理对象再去调用目标对象的方法
        teacherDaoProxy.teach();
    }

}
