package structural.decorator.java;

public class Test {
    public static void main(String[] args) {
        AbstractFood food = new Cake();
        food = new FruitDecorator(food);
        food = new CandleDecorator(food);
        food = new CandleDecorator(food);
        
        System.out.println(food.description() + "; 花费" + food.cost());
    }
}