package structural.adapter.java.objectadapter;

public class PowerAdapter implements DC5V {
    private AC220V ac220V;

    public PowerAdapter(AC220V ac220V) {
        this.ac220V = ac220V;
    }

    @Override
    public int outputDC5V() {
        int output = ac220V.outputAC220V() / 44;
        return output;
    }
}
