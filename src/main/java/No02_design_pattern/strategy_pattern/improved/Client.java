package No02_design_pattern.strategy_pattern.improved;

/**
 * create by 携山超 on 2020/6/27
 */
public class Client {
    public static void main(String[] args) {
        Duck duck = new WildDuck();
        duck.display();
        duck.fly();

        duck = new PekingDuck();
        duck.display();
        duck.fly();
    }
}
