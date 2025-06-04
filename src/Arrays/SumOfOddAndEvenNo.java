package Arrays;

public class SumOfOddAndEvenNo {
    public static void main(String[] args) {

     // int []a={1,2,3,4,5,6,7,8,9,10};
//        int a;
      int evennsum=0;
      int oddsum=0;
      for (int i=1;i<200;i++){
      if(i%2==0){
        evennsum=evennsum+i;
    }
   }

        for (int i=1;i<200;i++) {
            if (i % 2 != 0) {
                oddsum = oddsum + i;
            }
        }
        System.out.println("This sum of even no"+evennsum);
            System.out.println("This sum of odd no"+oddsum);

    }
}
//      for(int i=1;i<a.length;i++){
//          System.out.println("no of pistion"+i+" "+a[i]);
//      }
//      a=new int[5];
//      a[0]=6;
//      a[1]=10;
//      a[3]=30;
//
//
//        System.out.println(a[0]);
//        System.out.println(a[1]);
//        System.out.println(a[2]);
//        System.out.println(a[3]);
//        System.out.println(a[4]);
//        System.out.println(a[5]);
