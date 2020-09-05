package DesignPattern.Iterator;

import java.util.Iterator;
import java.util.List;

public class OutPutImpl {

    // 学院集合
    List<College> colleges;

    public OutPutImpl(List<College> colleges) {
        this.colleges = colleges;
    }

    // 遍历所有的学院，然后调用printDepartment输出各个学院的系
    public void printCollege() {
        // 从colleges里面取出所有学院，Java中的List已经实现了iterator接口
        Iterator<College> iterator = colleges.iterator();
        while (iterator.hasNext()) {
            // 取出一个学院
            College college = iterator.next();
            System.out.println("========" + college.getName() + "========");
            printDepartment(college.createIterator()); // 得到对应的迭代器
        }

    }

    // 学院输出系
    public void printDepartment(Iterator iterator) {
        while (iterator.hasNext()) {
            Department d = (Department) iterator.next();
            System.out.println(d.getName());
        }
    }
}
