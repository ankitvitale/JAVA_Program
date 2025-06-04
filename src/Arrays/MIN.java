package Arrays;

public class MIN {
    public static void main(String[] args) {
        int arr[]={98,58,6,1,35,9};
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);

    }
}