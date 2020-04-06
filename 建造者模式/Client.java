package funcfactory.builder.package01;

public class Client {
    public static void main(String[] args) {
        // 准备普通房子
        CommonHouse commonHouse = new CommonHouse();
        // 准备创建房子的指挥者 -- 普通房子
        HouseDirector h1  = new HouseDirector(commonHouse);

        // 返回房子
        h1.constructHouse();

        HighBuilding highBuilding = new HighBuilding();
//        HouseDirector h2 = new HouseDirector(highBuilding);
//        h2.constructHouse();
        h1.setHouseBuilder(highBuilding);
        h1.constructHouse();
    }
}
