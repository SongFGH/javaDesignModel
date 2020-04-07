package staticproxy;


// 代理对象，静态代理
public class TeacherDaoProxy implements ITeacherDao {

    private ITeacherDao target; // 目标对象，通过接口来聚合

    // 构造器
    public TeacherDaoProxy(ITeacherDao target) {
        super();
        this.target = target;
    }

    @Override
    public void teacher() {
        System.out.println("代理开始");
        target.teacher();
        System.out.println("代理结束");
    }
}
