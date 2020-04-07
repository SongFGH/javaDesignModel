package dynamicproxy;

public class TeacherDao implements ITeacherDao {
    @Override
    public void teacher() {
        System.out.println(" 老师正在授课中。。。 ");
    }

    @Override
    public void sayHello(String name) {
        System.out.println("hello"+name);
    }
}
