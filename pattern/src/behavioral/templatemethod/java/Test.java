package behavioral.templatemethod.java;

public class Test {
    public static void main(String[] args) {
        Cook cookSaltChicken = new CookSaltChicken();
        cookSaltChicken.cooking();
        System.out.println("=====================");
        Cook cookSugarChicken = new CookSugarChicken();
        cookSugarChicken.cooking();
    }
}
