package visitor;

public class Client {
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.attach(new Man());
        objectStructure.attach(new Man());

        // 成功
        Success success = new Success();
        objectStructure.display(success);

        // 失败
        Fail fail = new Fail();
        objectStructure.display(fail);

        // 待定
        Wait wait = new Wait();
        objectStructure.display(wait);
    }
}
