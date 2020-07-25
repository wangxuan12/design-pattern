package behavioral.chainofresponsibility.java;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        UploadVedioHandler vedioExistHandler = new VedioExistHandler();
        UploadVedioHandler vedioContentHandler = new VedioContentHandler();
        vedioExistHandler.setHandler(vedioContentHandler);

        String vedio = null;
        Random random = new Random();
        if (random.nextBoolean()) {
            vedio = "网抑云现状";
        }
        vedioExistHandler.handleRequest(vedio);
    }
}
