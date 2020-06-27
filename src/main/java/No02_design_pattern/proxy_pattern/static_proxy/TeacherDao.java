package No02_design_pattern.proxy_pattern.static_proxy;

public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("老师授课中~~~");
    }
}
