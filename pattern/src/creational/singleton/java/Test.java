package creational.singleton.java;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //序列化检测
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("singleton"));
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("singleton"));
        LazySingleton lazySingleton = LazySingleton.getInstance();
        out.writeObject(lazySingleton);
        LazySingleton newInstance = (LazySingleton) in.readObject();
        System.out.println(lazySingleton == newInstance); // 返回true

        //反射检测
        StaticInnerClassSingleton staticInnerClassSingleton = StaticInnerClassSingleton.getInstance();
        Constructor<StaticInnerClassSingleton> constructor = StaticInnerClassSingleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        StaticInnerClassSingleton reflectInstance = constructor.newInstance(); //抛出异常
        System.out.println(staticInnerClassSingleton == reflectInstance);

        //enum的检测 序列化和反射
        EnumInstance enumInstance = EnumInstance.INSTANCE;
        enumInstance.setData(new Object());

        out.writeObject(enumInstance);
        EnumInstance newEnumInstance = (EnumInstance) in.readObject();
        System.out.println(enumInstance == newEnumInstance); //返回true
        System.out.println(enumInstance.getData() == enumInstance.getData()); //返回true

        Constructor<EnumInstance> constructorEnum = EnumInstance.class.getDeclaredConstructor(String.class, int.class);
        constructorEnum.setAccessible(true);
        EnumInstance reflectEnumInstance = constructorEnum.newInstance("instance", 11); //抛出异常
        System.out.println(enumInstance == reflectEnumInstance);
    }
}
