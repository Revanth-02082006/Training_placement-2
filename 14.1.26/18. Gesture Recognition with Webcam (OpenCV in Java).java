import org.opencv.core.*;
import org.opencv.videoio.VideoCapture;

public class GestureRecognition {
    public static void main(String[] args) {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        VideoCapture cam = new VideoCapture(0);
        if (!cam.isOpened()) {
            System.out.println("Camera not found!");
            return;
        }
        Mat frame = new Mat();
        while (cam.read(frame)) {
            System.out.println("Frame captured: " + frame.size());
            // Add gesture detection logic here
        }
        cam.release();
    }
}
