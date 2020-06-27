package No02_design_pattern.singleton_pattern;

/**
 * ����ʽд����֮��̬�����
 *
 * ��д��һ����һ��
 */
public class Singleton02 {
    private static Singleton02 instance;

    static {
        instance = new Singleton02();
    }

    private Singleton02() {

    }

    public static Singleton02 getInstance() {
        return instance;
    }
}
