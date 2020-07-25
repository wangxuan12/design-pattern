package behavioral.chainofresponsibility.java;

import java.util.Random;

public class VedioContentHandler extends UploadVedioHandler{
    @Override
    void handleRequest(String vedio) {
        if (!checkContent(vedio)) {
            System.out.println("上传失败，视频内容不符合规范");
            return;
        }
        if (handler != null) {
            handler.handleRequest(vedio);
        } else {
            System.out.println("上传成功");
        }
    }

    private boolean checkContent(String vedio) {
        Random random = new Random();
        return random.nextBoolean();
    }
}
