package No02_design_pattern.builder_pattern;

/**
 * 分析
 * 1. 优点是比较好理解，简单易操作
 * 2. 设计过于简单，没有缓存层对象，程序的扩展和维护不好。即把产品和创建产品的过程封装在一起，增强了耦合性。
 * 3. 解决方案：将产品和产品建造的过程解耦
 */
public class Client {
    public static void main(String[] args) {
        AbstractHouse commonHouse = new CommonHouse();
        commonHouse.build();
    }
}
