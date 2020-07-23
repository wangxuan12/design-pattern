package creational.singleton.java;

public enum  EnumInstance {
    INSTANCE;
    private Object data;

    public void setData(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }
}
