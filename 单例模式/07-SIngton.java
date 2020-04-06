public class Singletontest {
    public static void main(String[] args) {
        SingleTon instance01 = SingleTon.getInstance();
        SingleTon instance02 = SingleTon.getInstance();
        System.out.println(instance01 == instance02);
        System.out.println(instance01.hashCode());
        System.out.println(instance02.hashCode());
    }
}



// 静态内部类
class SingleTon {
    private static volatile SingleTon instance;
    private SingleTon(){};

    // 静态内部类，该类中只有一个静态属性SingleTon
    private static class SingleTonInstance {
         private static final SingleTon INSTANCE = new SingleTon();
    }
    // 静态公有方法
    public static SingleTon getInstance(){
        return SingleTonInstance.INSTANCE;
    }
}