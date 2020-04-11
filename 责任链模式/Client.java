package responsibilitychain;

public class Client {
    public static void main(String[] args) {
        // 创建一个请求
        PurchaseRequest purchaseRequest = new PurchaseRequest(1,100,1);
        // 创建相关审批人
        DepartmentApprover departmentApprover=  new DepartmentApprover("张主任");
        CollegeApprover collegeApprover=  new CollegeApprover("李院长");
        ViceSchoolMasterApprover viceSchoolMasterApprover =  new ViceSchoolMasterApprover("王副院长");
        SchoolMasterApprover schoolMasterApprover = new SchoolMasterApprover("陈校长");

        // 需要将各个审批级别的下一个设置好（处理人形成环状结构）
        departmentApprover.setApprover(collegeApprover);
        collegeApprover.setApprover(viceSchoolMasterApprover);
        viceSchoolMasterApprover.setApprover(schoolMasterApprover);
        schoolMasterApprover.setApprover(departmentApprover);

        departmentApprover.processRequest(purchaseRequest);
    }
}
