package iterator;

import java.util.Iterator;

public class ComputerCollegeIterator implements Iterator {
    Department[] departments; //这里我们需要Department是以怎样的方式存放
    int position = 0; // 遍历的位置

    public ComputerCollegeIterator(Department[] departments) {
        super();
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

    @Override
    public Object next() {
        Department department = departments[position];
        position += 1;
        return department;
    }

    // 删除方法暂时不用实现
    public void remove(){

    }
}
