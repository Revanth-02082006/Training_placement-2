import javax.sound.sampled.*;
import java.util.*;

public class MorseCodeTranslator {
    private static final Map<Character, String> morseMap = new HashMap<>();
    static {
        morseMap.put('A', ".-"); morseMap.put('B', "-...");
        morseMap.put('C', "-.-."); morseMap.put('D', "-..");
        morseMap.put('E', "."); morseMap.put('F', "..-.");
        morseMap.put('G', "--."); morseMap.put('H', "....");
        morseMap.put('I', ".."); morseMap.put('J', ".---");
        morseMap.put('K', "-.-"); morseMap.put('L', ".-..");
        morseMap.put('M', "--"); morseMap.put('N', "-.");
        morseMap.put('O', "---"); morseMap.put('P', ".--.");
        morseMap.put('Q', "--.-"); morseMap.put('R', ".-.");
        morseMap.put('S', "..."); morseMap.put('T', "-");
        morseMap.put('U', "..-"); morseMap.put('V', "...-");
        morseMap.put('W', ".--"); morseMap.put('X', "-..-");
        morseMap.put('Y', "-.--"); morseMap.put('Z', "--..");
        morseMap.put(' ', "/");
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = sc.nextLine().toUpperCase();

        for (char c : input.toCharArray()) {
            String morse = morseMap.getOrDefault(c, "");
            System.out.print(morse + " ");
            playMorse(morse);
        }
    }

    private static void playMorse(String morse) throws Exception {
        for (char c : morse.toCharArray()) {
            if (c == '.') beep(200);
            else if (c == '-') beep(600);
            Thread.sleep(200);
        }
        Thread.sleep(600);
    }

    private static void beep(int duration) throws Exception {
        byte[] buf = new byte[1];
        AudioFormat af = new AudioFormat(8000f, 8, 1, true, false);
        try (SourceDataLine sdl = AudioSystem.getSourceDataLine(af)) {
            sdl.open(af);
            sdl.start();
            for (int i = 0; i < duration * 8; i++) {
                double angle = i / (8000f / 440) * 2.0 * Math.PI;
                buf[0] = (byte)(Math.sin(angle) * 127.0);
                sdl.write(buf, 0, 1);
            }
            sdl.drain();
        }
    }
}
