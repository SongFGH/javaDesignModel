package theroy.game;

public class Cilent {
    public static void main(String[] args) {
        // 创建游戏角色
        GameRole gameRole = new GameRole();
        gameRole.setVit(100);
        gameRole.setDef(100);

        System.out.println("大战前的状态");
        gameRole.display();

        // 把当前状态保存给caretaker
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(gameRole.createMemnto());

        System.out.println("和boss大战前");
        gameRole.setDef(30);
        gameRole.setVit(30);
        gameRole.display();

        System.out.println("大战后，使用备忘录把对象恢复到站前");
        gameRole.recoverGameRoleFromMemnto(caretaker.getMemento());
        gameRole.display();
    }
}
