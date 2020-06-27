package No02_design_pattern.strategy_pattern.improved;

/**
 * create by 携山超 on 2020/6/27
 */
public class BadFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("飞翔能力一般~~~");
    }
}
