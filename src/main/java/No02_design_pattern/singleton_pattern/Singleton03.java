package No02_design_pattern.singleton_pattern;

/**
 * ����ʽд��һ֮�̲߳���ȫ
 *
 * 1. �ŵ㣺����lazy loading��Ч����
 * 2. ȱ�㣺�̲߳���ȫ��ֻ���ڵ��߳���ʹ�á�
 * 3. ���ۣ���Ҫʹ�����ַ�ʽ��
 */
public class Singleton03 {

    private static Singleton03 instance;

    private Singleton03() {

    }

    public static Singleton03 getInstance() {
        if (instance == null) {
            instance = new Singleton03();
        }
        return instance;
    }
}
