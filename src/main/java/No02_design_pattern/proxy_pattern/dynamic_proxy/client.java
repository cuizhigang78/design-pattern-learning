package No02_design_pattern.proxy_pattern.dynamic_proxy;

/**
 * create by 携山超 on 2020/6/25
 */
public class client {
    public static void main(String[] args) {

        // 不实现接口，则Exception in thread "main" java.lang.ClassCastException
        ITeacherDao target = new TeacherDao();

        ITeacherDao proxyInstance = (ITeacherDao) new ProxyFactory(target).getProxyInstance();

        proxyInstance.teach();
    }
}
