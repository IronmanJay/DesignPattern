package DesignPattern.Prototype.deepclone;

public class Client {

    public static void main(String[] args) throws Exception {

        DeepPrototype p = new DeepPrototype();
        p.name = "宋江";
        p.deepCloneableTarget = new DeepCloneableTarget("大牛", "小牛");

        // 方式一完成深拷贝
        /*DeepPrototype p2 = (DeepPrototype) p.clone();
        System.out.println("p.name：" + p.name + "，p.deepCloneableTarget：" + p.deepCloneableTarget.hashCode());
        System.out.println("p2.name：" + p2.name + "，p2.deepCloneableTarget：" + p2.deepCloneableTarget.hashCode());*/

        // 方式2：完成深拷贝
        DeepPrototype p2 = (DeepPrototype) p.deepClone();
        System.out.println("p.name：" + p.name + "，p.deepCloneableTarget：" + p.deepCloneableTarget.hashCode());
        System.out.println("p2.name：" + p2.name + "，p2.deepCloneableTarget：" + p2.deepCloneableTarget.hashCode());

    }

}
