
public class Singletontest {
    public static void main(String[] args) {
        SingleTon instance01 = SingleTon.getInstance();
        SingleTon instance02 = SingleTon.getInstance();
        System.out.println(instance01 == instance02);
        System.out.println(instance01.hashCode());
        System.out.println(instance02.hashCode());
    }
}


class SingleTon{
    // 构造器私有化，外部不能new
    private SingleTon(){

    }
    // 内部创建对象实例
    private final static SingleTon instance = new SingleTon();
    // 静态方法，返回instance
    public static SingleTon getInstance(){
        return instance;
    }
}