package facade;

public class TheaterLight {
    //使用单例饿汉模式
    private static TheaterLight instance = new TheaterLight();

    public static TheaterLight getInstance() {
        return instance;
    }

    public void on() {
        System.out.println(" TheaterLight on ");
    }

    public void off() {
        System.out.println(" TheaterLight off ");
    }

    public void dim() {
        System.out.println(" TheaterLight dim ");
    }

    public void up() {
        System.out.println(" TheaterLight up ");
    }
}
