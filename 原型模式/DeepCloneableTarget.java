package funcfactory.yang;

import java.io.Serializable;

public class DeepCloneableTarget implements Serializable,Cloneable {
    private static final long serialVersionUid = 1;
    private String cloneName;
    private String cloneClass;

    // 构造器
    public DeepCloneableTarget(String cloneName, String cloneClass){
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }

    // 因为该类的属性都是字符串，我们使用默认的clone
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
