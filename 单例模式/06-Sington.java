public class Singletontest {
    public static void main(String[] args) {
        SingleTon instance01 = SingleTon.getInstance();
        SingleTon instance02 = SingleTon.getInstance();
        System.out.println(instance01 == instance02);
        System.out.println(instance01.hashCode());
        System.out.println(instance02.hashCode());
    }
}



// 双重检查
class SingleTon {
    private static volatile SingleTon instance;
    private SingleTon(){};

    // 静态公有方法，双重检查，解决线程安全问题，同时解决懒加载问题
    public static SingleTon getInstance(){
        if (instance == null){
            synchronized (SingleTon.class){
                if (instance == null){
                    instance = new SingleTon();
                    return instance;
                }
            }
        }
        return instance;
    }
}