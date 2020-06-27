package No02_design_pattern.strategy_pattern.improved;

/**
 * create by 携山超 on 2020/6/27
 */
public class WildDuck extends Duck {

    public WildDuck() {
        flyBehavior = new GoodFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println("这是野鸭！");
    }
}
