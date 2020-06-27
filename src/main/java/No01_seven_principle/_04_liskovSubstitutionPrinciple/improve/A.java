package No01_seven_principle._04_liskovSubstitutionPrinciple.improve;

public class A extends Base {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11-3=" + a.func1(11, 3));
        System.out.println("1-8=" + a.func1(1, 8));

        System.out.println("----------");
        B b = new B();
        System.out.println("11-3=" + b.func1(11, 3));
        System.out.println("1-8=" + b.func1(1, 8));
        System.out.println("11+3+9=" + b.func2(11, 3));
    }

    // 求差
    public int func1(int num1, int num2) {
        return num1 - num2;
    }
}

class Base {

}

class B extends Base {
    A a = new A();
    // 求和
    public int func1(int num1, int num2) {
        return num1 + num2;
    }

    // 求和再加9
    public int func2(int num1, int num2) {
        return func1(num1, num2) + 9;
    }
}