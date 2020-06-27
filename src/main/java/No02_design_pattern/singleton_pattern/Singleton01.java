package No02_design_pattern.singleton_pattern;

/**
 * ����ʽд��һ֮��̬����
 *
 * 1. �ŵ㣺�Ƚϼ򵥡�����װ�ص�ʱ��������ʵ�������������߳�ͬ�����⣬���̰߳�ȫ�ġ�
 * 2. ȱ�㣺û�������أ�lazy loading�������ܻ�����ڴ��˷ѡ�
 * 3. ���ۣ����ã�����������ڴ��˷ѡ�
 *
 * ֵ��ע����ǣ�����ʽ�������԰�ȫ��ͨ������������л����ƻ�����
 * https://blog.csdn.net/siying8419/article/details/82152921
 */
public class Singleton01 {
    private static Singleton01 instance = new Singleton01();

    private Singleton01() {

    }

    public static Singleton01 getInstance() {
        return instance;
    }
}
