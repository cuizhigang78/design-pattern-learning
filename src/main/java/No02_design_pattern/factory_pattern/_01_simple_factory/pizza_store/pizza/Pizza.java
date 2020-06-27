package No02_design_pattern.factory_pattern._01_simple_factory.pizza_store.pizza;

// ������Pizza
public abstract class Pizza {
    // ����
    protected String name;

    // ׼��ԭ����
    public abstract void prepare();
    // ��
    public void bake() {
        System.out.println(name + "baking;");
    }
    // ��
    public void cut() {
        System.out.println(name + "cutting;");
    }
    // װ
    public void box() {
        System.out.println(name + "boxing;");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
