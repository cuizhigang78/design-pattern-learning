package No02_design_pattern.singleton_pattern;

/**
 * ����ʽд����֮�̰߳�ȫ+ͬ������
 *
 * 1. �ŵ㣺������̲߳���ȫ������
 * 2. ȱ�㣺Ч��̫�ͣ�ÿ���߳����������ʵ����ʱ�򣬶�Ҫ����ͬ��������ʵ�������ִֻ��һ��ʵ��������͹��ˣ�
 * �����������ʵ����ֱ��return���ɡ�
 * 3. ���ۣ����Ƽ�ʹ��
 *
 */
public class Singleton04 {

    private static Singleton04 instance;

    private Singleton04() {

    }

    public static synchronized Singleton04 getInstance() {
        if (instance == null) {
            instance = new Singleton04();
        }
        return instance;
    }
}
