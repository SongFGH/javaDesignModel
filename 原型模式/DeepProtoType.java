package funcfactory.yang;

import java.io.*;

public class DeepProtoType implements Serializable,Cloneable {
    public String name;
    public DeepCloneableTarget deepCloneableTarget;
    public DeepProtoType(){
        super();
    }
    // 深拷贝 - 方式1 使用clone方法

    @Override
    public Object clone() throws CloneNotSupportedException{
        Object deep = null;
        // 这里完成对基本数据类型（属性）和String的克隆
        deep = super.clone();
        // 对引用类型的属性，进行单独处理
        DeepProtoType DeepProtoType = (DeepProtoType) deep;
        DeepProtoType.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();
        return DeepProtoType;
    }

    // 深拷贝 - 方式2 使用对象序列化实现（推荐）

    public Object deepClone(){
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try {
            // 序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this); //当前这个对象以对象流的方式输出

            // 反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepProtoType copyObj = (DeepProtoType) ois.readObject();
            return copyObj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
