package funcfactory.qiaojie;

public class Client {
    public static void main(String[] args) {
        FoldedPhone phone1 = new FoldedPhone(new Xiaomi());
        phone1.open();
        phone1.call();
        phone1.close();

        FoldedPhone phone2 = new FoldedPhone(new Vivo());
        phone2.open();
        phone2.call();
        phone2.close();
    }
}
