package Arrays;

public class LinnerSearch {
    public static void main(String[] args) {
        int a[]={10,20,30,40,50};
        int item=40;
         int temp=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==item){
                System.out.println("Item is peresent in "+i+" this Index posstion");
                temp=temp+1;

            }
        }
        if(temp==0){
            System.out.println("item is not found");
        }

    }
}
