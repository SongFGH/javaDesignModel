
public class Demeter {
    public static void main(String[] args) {
        SchoolManager schoolManager = new SchoolManager();
        schoolManager.printAllEmployee(new CollegeManager());
    }
}

//学院员工类
class CollegeEmployee {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

class CollegeManager {
    //返回学院的所有员工 //TODO CollegeEmployee 直接朋友
    public List<CollegeEmployee> getAllEmployee() {
        List<CollegeEmployee> list = new ArrayList<CollegeEmployee>();
        for (int i = 0; i < 10; i++) { //这里我们增加了10 个员工到list ，
            CollegeEmployee emp = new CollegeEmployee();
            emp.setId("学院员工id " + i);
            list.add(emp);
        }
        return list;
    }

    public void printCollegeEmployee() {
        List<CollegeEmployee> list1 = this.getAllEmployee();
        System.out.println("---学院员工----");
        for (CollegeEmployee e : list1) {
            System.out.println(e.getId());
        }
    }
}

//学校总部员工类
class SchoolEmployee {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

//学校管理类
//TODO 直接朋友 Employee CollegeManager
class SchoolManager {
    //返回学校总部的员工
    public List<SchoolEmployee> getAllEmployee() {
        List<SchoolEmployee> list = new ArrayList<SchoolEmployee>();
        for (int i = 0; i < 5; i++) { //这里我们增加了5个员工到list
            SchoolEmployee emp = new SchoolEmployee();
            emp.setId("学校总部员工id= " + i);
            list.add(emp);
        }
        return list;
    }

    //该方法完成输出学校总部和学院员工信息(id)
    void printAllEmployee(CollegeManager sub) {
        //获取到学院员工
        //TODO 非直接朋友 CollegeEmployee  应该提取到  CollegeManager
//        List<CollegeEmployee> list1 = sub.getAllEmployee();
//        System.out.println("---学院员工----");
//        for (CollegeEmployee e : list1) {
//            System.out.println(e.getId());
//        }
        sub.printCollegeEmployee();//只提供方法，不把具体实现放在其他类里面。

        //获取到学校总部员工
        List<SchoolEmployee> list2 = this.getAllEmployee();
        System.out.println("------学校总部员工------");
        for (SchoolEmployee e : list2) {
            System.out.println(e.getId());
        }
    }
}