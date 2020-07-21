package structural.decorator.java;

public class Cake extends AbstractFood {

    @Override
    public String description() {
        return super.description() + " 蛋糕";
    }

    @Override
    public int cost() {
        return 120;
    }
    
}