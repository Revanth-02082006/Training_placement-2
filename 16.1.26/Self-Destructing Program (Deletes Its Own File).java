import java.io.File;

public class SelfDestruct {
    public static void main(String[] args) {
        try {
            String className = "SelfDestruct.class";
            File file = new File(className);

            if (file.delete()) {
                System.out.println("Program self-destructed successfully 💥");
            } else {
                System.out.println("Could not self-destruct.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
