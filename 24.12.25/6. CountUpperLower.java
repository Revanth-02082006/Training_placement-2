public class CountUpperLower {
    public static void main(String[] args) {
        String str="HelloWorld";
        int upper=0,lower=0;
        for(char c:str.toCharArray()){
            if(Character.isUpperCase(c)) upper++;
            else if(Character.isLowerCase(c)) lower++;
        }
        System.out.println("Upper="+upper+", Lower="+lower);
    }
}
