package iterator;

import java.util.Iterator;
import java.util.List;

public class InfoColleageIterator implements Iterator {

    List<Department> departments; // 信息工程学院以List方式存放
    int index = -1; // 索引

    public InfoColleageIterator(List<Department> departments) {
        super();
        this.departments = departments;
    }

    // 判读list里面还有没有下一个元素
    @Override
    public boolean hasNext() {
        if(index >= departments.size() - 1 ){
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
    public void remove(){

    }
}
