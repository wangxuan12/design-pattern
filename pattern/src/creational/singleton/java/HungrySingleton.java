package creational.singleton.java;

public class HungrySingleton {
    private final static HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton() {
        //防止反射对单例的破坏
        if (hungrySingleton != null) {
            throw new RuntimeException("不允许反射创建对象");
        }
    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }

    /**
     * 防止序列化对单例的破坏
     */
    public Object readResolve() {
        return hungrySingleton;
    }
}
