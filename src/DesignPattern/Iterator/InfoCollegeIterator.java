package DesignPattern.Iterator;

import java.util.Iterator;
import java.util.List;

public class InfoCollegeIterator implements Iterator {

    // 信息工程学院是以List方式存放系
    List<Department> departments;
    int index = -1; // 索引

    public InfoCollegeIterator(List<Department> departments) {
        this.departments = departments;
    }

    // 判断list中还有没有下一个元素
    @Override
    public boolean hasNext() {
        if (index >= departments.size() - 1) {
            return false;
        } else {
            index += 1;
            return true;
        }
    }

    @Override
    public Object next() {
        return departments.get(index);
    }

    // 空实现remove
    public void remove() {

    }

}
