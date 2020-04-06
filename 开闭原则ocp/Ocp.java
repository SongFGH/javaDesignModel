
public class Ocp {
    public static void main(String[] args) {
        Use use = new Use();
        use.drawShape(new Triangle());
        use.drawShape(new Circle());
        use.drawShape(new OtherGraphics());//只需要让 此类继承 抽象类，子类实现具体方法  OCP原则
    }
}
class Use {
    public void drawShape(Shape shape) {
        shape.draw();
    }
}

abstract class Shape {
    public abstract void draw();
}

class Triangle extends Shape {

    @Override
    public void draw() {
        System.out.println("子类实现具体功能：三角形");
    }
}

class Circle extends Shape {

    @Override
    public void draw() {
        System.out.println("子类实现具体功能：圆形");
    }
}

class OtherGraphics extends Shape {

    @Override
    public void draw() {
        System.out.println("子类实现具体功能：任何形状");
    }
}