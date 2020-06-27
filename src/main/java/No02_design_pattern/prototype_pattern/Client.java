package No02_design_pattern.prototype_pattern;

/**
 * ������
 * 1. �ŵ������ײ�����
 * 2. ȱ�����ڴ����¶���ʱ��������Ҫ���»�ȡԭʼ��������ԣ����ڸ��Ӷ���Ч�ʺܵ͡�
 * 3. ������Ҫ���³�ʼ�����󣬶����Ƕ�̬�ػ�ö�������ʱ��״̬��������
 *
 * �Ľ�˼·��
 * Object���ṩ��һ��clone()�������÷������Խ�һ��Java������һ�ݡ�������Ҫʵ��Cloneable�ӿڡ�
 */
public class Client {
    public static void main(String[] args) {
        // һֻDolly��
        Sheep sheep = new Sheep("Dolly", 1, "white");
        // �ٿ�¡5ֻһëһ����
        Sheep sheep1 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep2 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep3 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep4 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep5 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());

        System.out.println(sheep);
        System.out.println(sheep1);
        System.out.println(sheep2);
        System.out.println(sheep3);
        System.out.println(sheep4);
        System.out.println(sheep5);
    }
}
