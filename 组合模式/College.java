package o01;

import java.util.ArrayList;
import java.util.List;

public class College extends OrganizationComponent {
    ArrayList<OrganizationComponent> organizationComponents = new ArrayList<OrganizationComponent>();

    // 构造器
    public College(String name, String dec) {
        super(name, dec);
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        organizationComponents.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
    }
    @Override
    public String getName(){
        return super.getName();
    }

    @Override
    public String getDes(){
        return super.getDes();
    }

    @Override
    protected void print(){
        System.out.println("=========="+getName()+"===========");
        // 遍历organizationComponent
        for (OrganizationComponent organizationComponent : organizationComponents) {
            organizationComponent.print();
        }
    }
}
