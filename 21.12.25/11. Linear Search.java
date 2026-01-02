public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={5,10,15,20};
        int key=15, pos=-1;
        for(int i=0;i<arr.length;i++) if(arr[i]==key) pos=i;
        System.out.println(pos!=-1?"Found at "+pos:"Not Found");
    }
}
