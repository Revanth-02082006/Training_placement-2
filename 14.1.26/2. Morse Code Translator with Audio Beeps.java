import java.util.HashMap;
import javax.sound.sampled.*;

public class MorseTranslator {
    static HashMap<Character, String> morse = new HashMap<>();
    static {
        morse.put('A', ".-"); morse.put('B', "-...");
        morse.put('C', "-.-."); morse.put('D', "-..");
        morse.put('E', "."); morse.put('F', "..-.");
        // Add more letters...
    }

    public static void beep(int ms) throws Exception {
        byte[] buf = new byte[1];
        AudioFormat af = new AudioFormat(8000f, 8, 1, true, false);
        SourceDataLine sdl = AudioSystem.getSourceDataLine(af);
        sdl.open(af);
        sdl.start();
        for (int i = 0; i < ms * 8; i++) {
            buf[0] = (byte)(Math.sin(i / 10.0) * 127.0);
            sdl.write(buf, 0, 1);
        }
        sdl.drain(); sdl.close();
    }

    public static void main(String[] args) throws Exception {
        String text = "ABC";
        for (char c : text.toCharArray()) {
            String code = morse.get(Character.toUpperCase(c));
            System.out.print(code + " ");
            for (char m : code.toCharArray()) {
                beep(m == '.' ? 100 : 300);
                Thread.sleep(100);
            }
        }
    }
}
