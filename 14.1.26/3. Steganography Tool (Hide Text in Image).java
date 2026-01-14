import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

public class Steganography {
    public static void hideText(BufferedImage img, String msg) {
        int msgIndex = 0;
        for (int y = 0; y < img.getHeight(); y++) {
            for (int x = 0; x < img.getWidth(); x++) {
                int rgb = img.getRGB(x, y);
                if (msgIndex < msg.length()) {
                    int bit = msg.charAt(msgIndex++) & 1;
                    rgb = (rgb & 0xFFFFFFFE) | bit;
                }
                img.setRGB(x, y, rgb);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedImage img = ImageIO.read(new File("input.png"));
        hideText(img, "HELLOJAVA");
        ImageIO.write(img, "png", new File("output.png"));
        System.out.println("Message hidden!");
    }
}
