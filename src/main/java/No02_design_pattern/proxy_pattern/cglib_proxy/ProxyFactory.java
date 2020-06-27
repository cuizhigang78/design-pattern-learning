package No02_design_pattern.proxy_pattern.cglib_proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * create by 携山超 on 2020/6/25
 */
public class ProxyFactory implements MethodInterceptor {
    // 维护一个被代理对象
    private Object target;

    // 传入被代理对象
    public ProxyFactory(Object target) {
        this.target = target;
    }

    // 获取代理对象，即target的子类
    public Object getProxyInstance() {
        // 1. 创建一个工具类
        Enhancer enhancer = new Enhancer();
        // 2. 设置父类即被代理类
        enhancer.setSuperclass(target.getClass());
        // 3. 设置回调函数
        enhancer.setCallback(this);
        // 4. 创建子类对象，即代理对象
        return enhancer.create();
    }

    // 重写intercept方法
    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("Cglib代理开始……");
        Object rtVal = method.invoke(target, args);
        System.out.println("Cglib代理结束！");
        return rtVal;
    }
}
