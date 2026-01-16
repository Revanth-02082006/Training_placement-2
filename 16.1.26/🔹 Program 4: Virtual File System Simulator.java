import java.util.*;

class VirtualFileSystem {
    private Map<String, String> files = new HashMap<>();

    public void createFile(String name, String content) {
        files.put(name, content);
    }

    public void deleteFile(String name) {
        files.remove(name);
    }

    public void listFiles() {
        files.keySet().forEach(System.out::println);
    }

    public String readFile(String name) {
        return files.getOrDefault(name, "File not found");
    }

    public static void main(String[] args) {
        VirtualFileSystem vfs = new VirtualFileSystem();
        vfs.createFile("hello.txt", "Hello World!");
        vfs.createFile("data.txt", "Sample Data");
        vfs.listFiles();
        System.out.println(vfs.readFile("hello.txt"));
        vfs.deleteFile("data.txt");
        vfs.listFiles();
    }
}
