package No02_design_pattern.prototype_pattern.deep_clone;

import java.io.*;

public class DeepProtoType implements Serializable, Cloneable {
    public String name;
    public DeepCloneableTarget target;

    /**
     * �����ʽһ ʹ��clone()����
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        DeepProtoType deepProtoType = (DeepProtoType) super.clone();
        deepProtoType.target = (DeepCloneableTarget) target.clone();
        return deepProtoType;
    }

    /**
     * ʹ�����л������л���ʽ
     * @return
     * @throws CloneNotSupportedException
     */
    protected Object deepClone() throws CloneNotSupportedException {
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try {
            // ���л�
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            // �����л�
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepProtoType copyObject = (DeepProtoType) ois.readObject();

            return copyObject;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (bos != null) {
                    bos.close();
                }
                if (oos != null) {
                    bos.close();
                }
                if (bis != null) {
                    bos.close();
                }
                if (ois != null) {
                    bos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
