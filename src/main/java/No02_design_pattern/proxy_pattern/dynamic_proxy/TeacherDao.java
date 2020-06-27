package No02_design_pattern.proxy_pattern.dynamic_proxy;

/**
 * create by 携山超 on 2020/6/25
 */
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("老师授课中……");
    }
}
