package Arrays;

public class Rverse {
    public static void main(String[] args) {
        int []a={1,8,5,3,7};

        for(int i=0;i<a.length;i++){
            System.out.print(" "+a[i]);
        }
        System.out.println();

        for(int j=a.length-1;j>=0;j--){
            System.out.print(" "+a[j]);
        }
    }
}
