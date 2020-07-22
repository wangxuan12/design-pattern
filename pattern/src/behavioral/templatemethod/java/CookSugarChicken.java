package behavioral.templatemethod.java;

public class CookSugarChicken extends Cook{
    @Override
    void addFood() {
        System.out.println("加鸡肉");
    }

    @Override
    protected boolean needSugar() {
        return true;
    }
}
