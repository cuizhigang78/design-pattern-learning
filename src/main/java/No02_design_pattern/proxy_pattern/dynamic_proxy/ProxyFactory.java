package No02_design_pattern.proxy_pattern.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * create by 携山超 on 2020/6/25
 */
public class ProxyFactory {
    // 维护一个目标对象
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    /**
     * public static Object newProxyInstance(ClassLoader loader,
     *                                           Class<?>[] interfaces,
     *                                           InvocationHandler h)throws IllegalArgumentException{
     * }
     *
     * ClassLoader loader：指定当前目标对象使用的类加载器，写法固定
     * Class<?>[] interfaces：目标对象实现的接口类型，使用泛型确认类型，写法固定
     * InvocationHandler h：事件处理器，执行目标对象的方法时，会触发事件处理器方法，
     *                      会把当前执行的目标对象方法作为参数传入
     * @return
     */
    public Object getProxyInstance() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("JDK代理开始……");
                        Object rtVal = method.invoke(target, args);
                        System.out.println("JDK代理结束！");
                        return rtVal;
                    }
                });
    }
}
