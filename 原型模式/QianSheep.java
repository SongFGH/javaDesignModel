package funcfactory.yang;

public class QianSheep implements Cloneable {
    private String name;
    private int age;
    private String color;

    public QianSheep(String name,int age,String color){
        super();
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Sheep [" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ']';
    }

    // 克隆该实例，使用默认的clone方法来完成
    @Override
    protected Object clone() {
        QianSheep sheep = null;
        try {
            sheep = (QianSheep) super.clone();
        }
        catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());;
        }
        return sheep;
    }
}
