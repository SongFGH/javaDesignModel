package theroy;

public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Cartaker cartaker = new Cartaker();

        originator.setState(" 状态#1 攻击力100 ");
        // 保存当前状态
        cartaker.add(originator.saveStateMemento());

        originator.setState("状态#1攻击力80");
        cartaker.add(originator.saveStateMemento());

        originator.setState("状态#1攻击力50");
        cartaker.add(originator.saveStateMemento());


        // 当前状态
        System.out.println("当前的状态是：="+ originator.getState());

        // 恢复到第一个状态
        originator.getStateFromMemento(cartaker.get(0));
        System.out.println("当前的状态是：="+ originator.getState());
    }
}
