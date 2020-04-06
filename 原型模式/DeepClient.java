package funcfactory.yang;

public class DeepClient {
    public static void main(String[] args)  throws Exception {
        DeepProtoType p1 = new DeepProtoType();
        p1.name = "达拉";
        p1.deepCloneableTarget = new DeepCloneableTarget("大牛","大牛牛");

        // 方式1 完成深拷贝
        DeepProtoType p2 = (DeepProtoType) p1.clone();
        System.out.println(p1.name+"  "+ p1.deepCloneableTarget.hashCode());
        System.out.println(p2.name+"  "+ p2.deepCloneableTarget.hashCode());

        // 方式2 完成深拷贝
        DeepProtoType p3 = (DeepProtoType) p1.deepClone();
        System.out.println(p1.name+"  "+ p1.deepCloneableTarget.hashCode());
        System.out.println(p3.name+"  "+ p3.deepCloneableTarget.hashCode());
    }
}
