package facade;

public class Popcorn {
    //使用单例饿汉模式
    private static Popcorn instance = new Popcorn();
    public static Popcorn getInstance(){
        return instance;
    }

    public void on(){
        System.out.println(" Popcorn on ");
    }

    public void off(){
        System.out.println(" Popcorn off ");
    }

    public void pop(){
        System.out.println(" Popcorn poping ");
    }
}
