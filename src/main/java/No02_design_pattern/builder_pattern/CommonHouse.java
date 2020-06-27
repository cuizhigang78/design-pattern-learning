package No02_design_pattern.builder_pattern;

public class CommonHouse extends AbstractHouse {
    @Override
    public void buildBasic() {
        System.out.println("����ͨ���Ӵ�ػ�");
    }

    @Override
    public void buildWalls() {
        System.out.println("����ͨ������ǽ");
    }

    @Override
    public void roofed() {
        System.out.println("����ͨ���ӸǶ�");
    }
}
