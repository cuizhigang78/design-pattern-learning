package No02_design_pattern.prototype_pattern.deep_clone;

import java.io.Serializable;

public class DeepCloneableTarget implements Serializable, Cloneable {
    public static final long serialVersionUID = 1L;
    public String cloneName;

    public DeepCloneableTarget(String cloneName) {
        this.cloneName = cloneName;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
