package structural.decorator.java;

public abstract class AbstractDecorator extends AbstractFood {
    private AbstractFood abstractFood;

    public AbstractDecorator(AbstractFood abstractFood) {
        this.abstractFood = abstractFood;
    }

    @Override
    public String description() {
        return this.abstractFood.description();
    }

    @Override
    public int cost() {
        return this.abstractFood.cost();
    }
}