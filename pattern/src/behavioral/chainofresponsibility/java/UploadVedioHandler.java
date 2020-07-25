package behavioral.chainofresponsibility.java;

public abstract class UploadVedioHandler {
    protected UploadVedioHandler handler;

    public void setHandler(UploadVedioHandler handler) {
        this.handler = handler;
    }

    abstract void handleRequest(String vedio);
}
