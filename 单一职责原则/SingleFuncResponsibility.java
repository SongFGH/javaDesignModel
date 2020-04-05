public class SingleFuncResponsibility {
    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("摩托车");
        roadVehicle.runAir("飞机");
        roadVehicle.runWater("轮船");
    }
}

// 虽然没有在类级别上遵循单一职责原则，但是在方法级别上遵循
class RoadVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "公路运行");
    }
    public void runAir(String vehicle) {
        System.out.println(vehicle + "空中运行");
    }
    public void runWater(String vehicle) {
        System.out.println(vehicle + "水路运行");
    }
}