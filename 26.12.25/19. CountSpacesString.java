public class CountSpacesString {
    public static void main(String[] args) {
        String s="Java is powerful and fun";
        int count=0;
        for(char c:s.toCharArray()) if(Character.isWhitespace(c)) count++;
        System.out.println("Spaces count = "+count);
    }
}
