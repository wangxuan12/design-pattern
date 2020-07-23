package creational.singleton.java;

import java.io.*;

public class LazySingleton implements Serializable {
    private static LazySingleton lazySingleton = null;

    private LazySingleton() {}

    //在方法修饰符上添加 synchronized 变为线程安全的
    public static LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

    /**
     * 防止序列化对单例的破坏
     *
     * 在使用ObjectInputStream调用readObject(),
     * 内部会使用反射，最终执行invokeReadResolve,替换掉反射生成的对象
     */
    public Object readResolve() {
        return lazySingleton;
    }
}
