package Arrays;

public class A {
    public static void main(String[] args) {
      //  int [] arr= new int[10];
//        arr [3]=30;
//        arr [8]=22;
//
//        for (int i=0;i<arr.length;i++){
//            System.out.println(i+"=="+arr[i]);
//        }


        int []arr={3,5,8,6,1,7};
          int sum=0;
          for(int i=0;i<arr.length;i++){
              sum=sum+arr[i];
          }

        System.out.println(sum);
    }
}
