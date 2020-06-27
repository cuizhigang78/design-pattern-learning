package No01_seven_principle._02_interfaceSegregationPrinciple;

/**
 * 接口隔离原则
 *
 * 1. 使用多个专门的接口比使用单一的总接口要好。
 * 2. 一个类对另外一个类的依赖性应当是建立在最小的接口上的。
 * 3.一个接口代表一个角色，不应当将不同的角色都交给一个接口。没有关系的接口
 * 合并在一起，形成一个臃肿的大接口，这是对角色和接口的污染。
 * 4. 不要强迫客户使用它们不用的方法，如果强迫用户使用它们不使用的方法，那么
 * 这些客户就会面临由于这些不使用的方法的改变所带来的改变。
 */
public class InterfaceSegregationPrinciple {
}

// 接口Interface1中定义了五个方法
interface Interface1 {
    void operate1();
    void operate2();
    void operate3();
    void operate4();
    void operate5();
}

// 类A实现了Interface1
class A implements Interface1 {
    public void operate1() {
        System.out.println("A operate1");
    }

    public void operate2() {
        System.out.println("A operate2");
    }

    public void operate3() {
        System.out.println("A operate3");
    }

    public void operate4() {
        System.out.println("A operate4");
    }

    public void operate5() {
        System.out.println("A operate5");
    }
}
// 类B实现了Interface1
class B implements Interface1 {
    public void operate1() {
        System.out.println("B operate1");
    }

    public void operate2() {
        System.out.println("B operate2");
    }

    public void operate3() {
        System.out.println("B operate3");
    }

    public void operate4() {
        System.out.println("B operate4");
    }

    public void operate5() {
        System.out.println("B operate5");
    }
}

// 类C需要Interface1其中的三个方法
class C {
    void depend1(Interface1 i) {
        i.operate1();
    }
    void depend2(Interface1 i) {
        i.operate2();
    }
    void depend3(Interface1 i) {
        i.operate3();
    }
}

// 类C需要Interface1其中的三个方法
class D {
    void depend1(Interface1 i) {
        i.operate1();
    }
    void depend2(Interface1 i) {
        i.operate4();
    }
    void depend3(Interface1 i) {
        i.operate5();
    }
}
