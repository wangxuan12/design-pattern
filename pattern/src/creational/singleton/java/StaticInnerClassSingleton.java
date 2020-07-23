package creational.singleton.java;

public class StaticInnerClassSingleton {
    private StaticInnerClassSingleton() {
        //防止反射对单例的破坏
        if (InnerClass.staticInnerClassSingleton != null) {
            throw new RuntimeException("不允许反射创建对象");
        }
    }

    public static StaticInnerClassSingleton getInstance() {
        return InnerClass.staticInnerClassSingleton;
    }

    public static class InnerClass {
        private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }

    /**
     * 防止序列化对单例的破坏
     */
    public Object readResolve() {
        return InnerClass.staticInnerClassSingleton;
    }
}
