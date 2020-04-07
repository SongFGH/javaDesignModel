package o01;

import java.util.ArrayList;
import java.util.List;

public class Department extends OrganizationComponent {
    ArrayList<OrganizationComponent> organizationComponents = new ArrayList<OrganizationComponent>();

    // 构造器
    public Department(String name, String dec) {
        super(name, dec);
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
        System.out.println(getName());
    }
}
