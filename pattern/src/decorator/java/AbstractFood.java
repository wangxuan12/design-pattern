package decorator.java;

public abstract class AbstractFood {
    
    public String description() {
        return "食物";
    }

    public void doSomething() {
        //do something
    }

    public abstract int cost();
}