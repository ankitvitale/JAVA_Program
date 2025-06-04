package Arrays;

public class MAx {
    public static void main(String[] args) {
        int a[]={1,9,7,5,3,6,2,10};
        int max=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }


        }
        System.out.println(max);
    }
}
