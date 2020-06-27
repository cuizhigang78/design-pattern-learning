package No02_design_pattern.strategy_pattern.improved;

/**
 * create by 携山超 on 2020/6/27
 */
public class GoodFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("擅长飞翔~~~");
    }
}
