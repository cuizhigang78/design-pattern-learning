package No02_design_pattern.strategy_pattern.improved;

/**
 * create by 携山超 on 2020/6/27
 */
public class PekingDuck extends Duck {

    public PekingDuck() {
        flyBehavior = new NoFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println("这是北京鸭!");
    }
}
