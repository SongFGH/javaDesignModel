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
   private static SingleTon instance;
   private SingleTon(){

   }
   // 当用到该方法时，才去创建实例
   public static  SingleTon getInstance(){
       if (instance == null){
           synchronized (SingleTon.class){
               instance = new SingleTon();
           }
       }
       return instance;
   }
}