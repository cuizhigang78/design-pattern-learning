package No02_design_pattern.singleton_pattern;

/**
 * ��̬�ڲ���д��
 *
 * 1. ���ַ�ʽ��������װ�صĻ�������֤��ʼ��ʵ��ʱֻ��һ���߳�
 * 2. ��̬�ڲ�����Singleton07��װ��ʱ������������ʼ������������Ҫʱ��ʵ������ʵ����lazy loading
 * 3. ��ľ�̬����ֻ���ڵ�һ�μ������ʱ���ʼ��
 * 4. �ŵ㣺�̰߳�ȫ�����þ�̬�ڲ�����ص�ʵ��lazy loading��Ч�ʸ�
 * 5. ���ۣ��Ƽ�ʹ��
 */
public class Singleton07 {

    private Singleton07() {

    }

    private static class SingletonInstance {
        private static final Singleton07 INSTANCE = new Singleton07();
    }

    public static Singleton07 getInstance() {
        return SingletonInstance.INSTANCE;
    }
}
