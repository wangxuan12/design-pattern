package structural.adapter.java.classadapter;

public class PowerAdapter extends AC220V implements DC5V{
    @Override
    public int outputDC5V() {
        int output = super.outputAC220V() / 44;
        return output;
    }
}
