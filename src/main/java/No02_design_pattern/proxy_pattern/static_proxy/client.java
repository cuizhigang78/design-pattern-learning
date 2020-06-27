package No02_design_pattern.proxy_pattern.static_proxy;

public class client {
    public static void main(String[] args) {

        ITeacherDao target = new TeacherDao();

        TeacherDaoProxy proxy = new TeacherDaoProxy(target);

        proxy.teach();
    }
}
