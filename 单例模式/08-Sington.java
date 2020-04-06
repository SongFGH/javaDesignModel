public class Singletontest {
    public static void main(String[] args) {
        SingleTon instance01 = SingleTon.INSTANCE();
        SingleTon instance02 = SingleTon.INSTANCE();
        System.out.println(instance01 == instance02);
        System.out.println(instance01.hashCode());
        System.out.println(instance02.hashCode());
    }
}



// 枚举
enum SingleTon {
    INSTANCE;
    public void sayOk(){
        System.out.println("ok");
    }
}