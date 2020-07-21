package structural.decorator.java;

public class FruitDecorator extends AbstractDecorator {
    
    public FruitDecorator(AbstractFood abstractFood) {
        super(abstractFood);
    }

    @Override
    public String description() {
        return super.description() + ", 水果";
    }

    @Override
    public int cost() {
        return super.cost() + 10;
    }
}