package No02_design_pattern.singleton_pattern;

/**
 * ����ʽд����֮�̰߳�ȫ+ͬ�������
 *
 * 1. �ŵ㣺����һ��д�������˸Ľ��������Ч�ʡ�
 * 2. ȱ�㣺��������ͬ�������ã��̲߳���ȫ��
 * 3. ���ۣ�����ʹ�����ַ���
 *
 */
public class Singleton05 {

    private static Singleton05 instance;

    private Singleton05() {

    }

    public static Singleton05 getInstance() {
        if (instance == null) {
            synchronized (Singleton05.class) {
                instance = new Singleton05();
            }
        }
        return instance;
    }
}
