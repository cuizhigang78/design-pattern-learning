package No02_design_pattern.strategy_pattern.traditional;

/**
 * create by 携山超 on 2020/6/27
 */
public class PekingDuck extends Duck {
    @Override
    public void display() {
        System.out.println("这是北京鸭!");
    }

    /**
     * 因为北京鸭不会飞，所以重写fly方法
     */
    @Override
    public void fly() {
        System.out.println("北京鸭不会飞!");
    }
}
