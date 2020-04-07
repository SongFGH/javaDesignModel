package o01;

public class Client {
    public static void main(String[] args) {

        // 创建学校
        OrganizationComponent university= new University("清华大学","中国顶级大学");

        // 创建学院
        OrganizationComponent computerCollege = new College("计算机学院","IT");
        OrganizationComponent informationCollege = new College("信息工程","IT");

        // 创建各个学院下面的系
        computerCollege.add(new Department("软件工程","软件工程不粗"));
        computerCollege.add(new Department("网络工程","网络工程不粗"));
        computerCollege.add(new Department("计算机科学与计算","计算机科学与计算不粗"));

        informationCollege.add(new Department("通信工程","网络工程不粗"));
        informationCollege.add(new Department("信息学与计算","计算机科学与计算不粗"));


        // 将学院加入到学校
        university.add(computerCollege);
        university.add(informationCollege);

        computerCollege.print();
        informationCollege.print();
        university.print();
    }
}
