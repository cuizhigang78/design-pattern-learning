package No02_design_pattern.prototype_pattern.improve;

public class Client {
    public static void main(String[] args) {
        // һֻdolly��
        Sheep dolly = new Sheep("dolly", 1, "white");
        dolly.setFriend(new Sheep("shaun", 2, "black"));

        // �ٿ�¡5ֻһëһ����
        Sheep sheep1 = (Sheep) dolly.clone();
        Sheep sheep2 = (Sheep) dolly.clone();
        Sheep sheep3 = (Sheep) dolly.clone();
        Sheep sheep4 = (Sheep) dolly.clone();
        Sheep sheep5 = (Sheep) dolly.clone();

        System.out.println(dolly);
        System.out.println(sheep1);
        System.out.println(sheep2);
        System.out.println(sheep3);
        System.out.println(sheep4);
        System.out.println(sheep5);

        System.out.println(dolly.getFriend());
        System.out.println(sheep1.getFriend());
        System.out.println(sheep2.getFriend());
        System.out.println(sheep3.getFriend());
        System.out.println(sheep4.getFriend());
        System.out.println(sheep5.getFriend());
    }
}
