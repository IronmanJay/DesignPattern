package DesignPattern.Proxy.DynamicProxy;

public class Client {

    public static void main(String[] args) {
        // 创建目标对象
        TeacherDao target = new TeacherDao();
        // 给目标对象，创建代理对象，可以转成ITeacherDao
        ITeacherDao proxyInstance = (ITeacherDao) new ProxyFactory(target).getProxyInstance();
        // 内存中动态生成了代理对象
        System.out.println("proxyInstance" + proxyInstance);
        // 通过代理对象调用目标对象的方法
        proxyInstance.teach();
    }

}
