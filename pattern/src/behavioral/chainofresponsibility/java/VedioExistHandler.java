package behavioral.chainofresponsibility.java;

public class VedioExistHandler extends UploadVedioHandler{
    @Override
    void handleRequest(String vedio) {
        if (vedio == null || "".equals(vedio.trim())) {
            System.out.println("上传失败，此视频不存在");
            return;
        }
        if (handler != null) {
            handler.handleRequest(vedio);
        } else {
            System.out.println("上传成功");
        }
    }
}
