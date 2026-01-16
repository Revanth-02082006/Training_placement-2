import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

public class ASCIIArt {
    private static final String CHARS = "@#%*+=-:. ";

    public static void main(String[] args) throws Exception {
        BufferedImage img = ImageIO.read(new File("input.jpg"));
        for (int y = 0; y < img.getHeight(); y += 2) {
            for (int x = 0; x < img.getWidth(); x++) {
                int rgb = img.getRGB(x, y);
                int gray = (rgb >> 16 & 0xff) + (rgb >> 8 & 0xff) + (rgb & 0xff);
                gray /= 3;
                int index = (gray * (CHARS.length() - 1)) / 255;
                System.out.print(CHARS.charAt(index));
            }
            System.out.println();
        }
    }
}
