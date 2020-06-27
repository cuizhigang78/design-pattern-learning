package No02_design_pattern.proxy_pattern.cglib_proxy;

/**
 * create by 携山超 on 2020/6/25
 */
public class client {
    public static void main(String[] args) {

        TeacherDao target = new TeacherDao();

        TeacherDao proxyInstance = (TeacherDao) new ProxyFactory(target).getProxyInstance();

        proxyInstance.teach();
    }
}
