public class CountLinesString {
    public static void main(String[] args){
        String text="Line1\nLine2\nLine3";
        int lines=text.split("\n").length;
        System.out.println("Lines = "+lines);
    }
}
