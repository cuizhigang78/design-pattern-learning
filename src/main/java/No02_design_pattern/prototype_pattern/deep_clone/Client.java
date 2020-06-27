package No02_design_pattern.prototype_pattern.deep_clone;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        DeepProtoType deepProtoType = new DeepProtoType();
        deepProtoType.name = "dolly";
        deepProtoType.target = new DeepCloneableTarget("sheep");

        //DeepProtoType clone = (DeepProtoType) deepProtoType.clone();
        DeepProtoType clone = (DeepProtoType) deepProtoType.deepClone();

        System.out.println(deepProtoType.name);
        System.out.println(deepProtoType.target);
        System.out.println(deepProtoType.target.cloneName);
        System.out.println(clone.name);
        System.out.println(clone.target);
        System.out.println(clone.target.cloneName);
    }
}
