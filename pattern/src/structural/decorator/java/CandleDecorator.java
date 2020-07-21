package structural.decorator.java;

public class CandleDecorator extends AbstractDecorator {

    public CandleDecorator(AbstractFood abstractFood) {
        super(abstractFood);
    }

    @Override
    public String description() {
        return super.description() + ", 蜡烛";
    }

    @Override
    public int cost() {
        return super.cost() + 1;
    }
    
}