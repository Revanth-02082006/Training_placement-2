public class RemoveDuplicatesString {
    public static void main(String[] args){
        String s="programming";
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            if(sb.indexOf(String.valueOf(c))==-1) sb.append(c);
        }
        System.out.println("Without duplicates: "+sb);
    }
}
