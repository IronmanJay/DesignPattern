package DesignPattern.Composite;

public class Department extends OrganizationComponent {

    // 没有集合

    public Department(String name, String des) {
        super(name, des);
    }

    // add和remove不用再也写了，因为这是叶子节点

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    // print方法就是输出University包含的学院
    @Override
    protected void print() {
        System.out.println(getName());
    }
}
