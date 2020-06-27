package No02_design_pattern.singleton_pattern;

/**
 * ����ʽд����֮˫�˼���
 *
 * 1. �ŵ㣺���Ч�ʵ�ͬʱ��֤���̰߳�ȫ
 * 2. ȱ�㣺����ϸ���
 * 3. ���ۣ��Ƽ�ʹ��
 *
 */
public class Singleton06 {

    private static Singleton06 instance;

    private Singleton06() {

    }

    public static Singleton06 getInstance() {
        if (instance == null) {
            synchronized (Singleton06.class) {
                if (instance == null) {
                    instance = new Singleton06();
                }
            }
        }
        return instance;
    }
}
