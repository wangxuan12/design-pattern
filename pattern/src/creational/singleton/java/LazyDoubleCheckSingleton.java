package creational.singleton.java;

public class LazyDoubleCheckSingleton {
    //加上volatile，会加上一个内存屏障，保证了2和3之间不会重排序
    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;
    private LazyDoubleCheckSingleton() {}

    public static LazyDoubleCheckSingleton getInstance() {
        if (lazyDoubleCheckSingleton == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (lazyDoubleCheckSingleton == null) {
                    //这里不是原子操作，会产生三个步骤
                    //1.分配内存给这个对象
                    //2.初始化对象
                    //3.设置lazyDoubleCheckSingleton指向刚分配的内存地址
                    //而2和3之间可能被重排序，在多线程的情况下可能会造成
                    //线程1 执行了2和3，还没有执行2，也就是指向了内存但还没初始化内存
                    //线程2 在第一层检查处，会发现singleton指向不为空，就会返回一个还没有初始化的对象，出现异常
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }

    /**
     * 防止序列化对单例的破坏
     */
    public Object readResolve() {
        return lazyDoubleCheckSingleton;
    }
}
