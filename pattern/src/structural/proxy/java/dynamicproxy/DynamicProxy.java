package structural.proxy.java.dynamicproxy;

import structural.flyweight.java.Game;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxy implements InvocationHandler {
    private Object target;

    public DynamicProxy(Object target) {
        this.target = target;
    }

    public Object bind() {
        Class<?> cls = target.getClass();
        return Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object argObj = args[0];
        beforeMethod(argObj);
        Object object = method.invoke(target, args);
        afterMethod(argObj);
        return object;
    }

    private void beforeMethod(Object obj) {
        if (obj instanceof String) {
            String game = (String) obj;
            System.out.println("先买玩" + game + "所需要的主机");
        }
    }

    private void afterMethod(Object obj) {
        if (obj instanceof String) {
            String game = (String) obj;
            System.out.println("玩" + game);
        }
    }
}
