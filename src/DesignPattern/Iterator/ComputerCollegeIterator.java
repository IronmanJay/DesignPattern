package DesignPattern.Iterator;

import java.util.Iterator;

public class ComputerCollegeIterator implements Iterator {

    // 这里需要知道Department是以怎样的方式存放=>数组
    Department[] departments;
    int position = 0; // 遍历位置

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    // 判断是否还有下一个元素
    @Override
    public boolean hasNext() {
        if (position >= departments.length || departments[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    // 取下一个元素
    @Override
    public Object next() {
        Department department = departments[position];
        position += 1;
        return department;
    }

    // 删除的方法，默认空实现
    public void remove() {

    }

}
