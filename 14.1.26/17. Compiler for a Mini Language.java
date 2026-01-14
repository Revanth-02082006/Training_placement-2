import java.util.*;

public class MiniCompiler {
    public static void main(String[] args) {
        String code = "PRINT Hello; PRINT Java;";
        for (String stmt : code.split(";")) {
            stmt = stmt.trim();
            if (stmt.startsWith("PRINT")) {
                System.out.println(stmt.substring(5).trim());
            }
        }
    }
}
