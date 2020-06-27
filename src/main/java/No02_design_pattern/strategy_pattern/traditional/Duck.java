package No02_design_pattern.strategy_pattern.traditional;

/**
 * create by 携山超 on 2020/6/26
 */
public abstract class Duck {

    public Duck() {
    }

    public abstract void display();

    public void quack() {
        System.out.println("鸭子嘎嘎叫~~~");
    }

    public void swim() {
        System.out.println("鸭子会游泳~~~");
    }

    public void fly() {
        System.out.println("鸭子会飞翔~~~");
    }
}
