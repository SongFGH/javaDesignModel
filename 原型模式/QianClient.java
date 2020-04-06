package funcfactory.yang;

public class QianClient {
    public static void main(String[] args) {
        QianSheep q1 = new QianSheep("tom",1,"白色");
        QianSheep q2 = (QianSheep) q1.clone(); //克隆
        System.out.println(q1);
        System.out.println(q2);
        System.out.println(q1.hashCode());
        System.out.println(q2.hashCode());
    }
}
