# 开闭原则

- 开闭原则(Open Closed Principle) 是编程中最基础、最重要的设计原则；
- 一个软件实体，比如类，模块和函数应该对提供方扩展开放，对使用方修改关闭。用抽象构建框架，用实现扩展细节；
- 当软件需要变化时，尽量通过扩展软件实体的行为来实现变化，而不是通过修改已有的代码来实现变化；
- 编程中遵循其它原则，以及使用设计模式的目的就是遵循开闭原则。



案例：
```
public class ProblemOcp {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
    }
}


// 使用方
class GraphicEditor {
    public void drawShape(Shape s) {
        if (s.m_type ==1 ) {
            drawRectangle(s);
        }
        if (s.m_type == 2){
            drwaCircle(s);
        }
    }

    public void drawRectangle(Shape shape){
        System.out.println("绘制距型");
    }
    public void drwaCircle(Shape shape){
        System.out.println("绘制圆形");
    }
}


// 基类
class  Shape {
    int m_type;
}

// 提供方
class Rectangle extends  Shape {
    Rectangle(){
        super.m_type = 1;
    }
}

// 提供方
class Circle extends  Shape {
    Circle(){
        super.m_type = 2;
    }
}
```
- 改进思路
  把创建的Shape类当做一个抽象类，并提供一个draw方法，让子类去实现即可，这样我们增加一个三角形，只需要让三角形继承Shape，并实现draw方法即可，使用方不需要修改代码。这样满足开闭原则。