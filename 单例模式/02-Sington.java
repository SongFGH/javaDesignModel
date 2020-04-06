public class Singletontest {
    public static void main(String[] args) {
        SingleTon instance01 = SingleTon.getInstance();
        SingleTon instance02 = SingleTon.getInstance();
        System.out.println(instance01 == instance02);
        System.out.println(instance01.hashCode());
        System.out.println(instance02.hashCode());
    }
}


class SingleTon {
    private SingleTon() {

    }

    private static SingleTon instance;

    // 在静态代码块中创建单例对象
    static {
        instance = new SingleTon();
    }

    public static SingleTon getInstance(){
        return instance;
    }
}