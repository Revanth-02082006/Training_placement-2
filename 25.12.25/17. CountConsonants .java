public class CountConsonants {
    public static void main(String[] args) {
        String s = "HelloWorld";
        int count = 0;
        for(char c : s.toLowerCase().toCharArray()){
            if(Character.isLetter(c) && "aeiou".indexOf(c) == -1) count++;
        }
        System.out.println("Consonants = " + count);
    }
}
