package Map;

import java.util.*;

public class RemoveDuplicateNumbers {
    public static void main(String[] args) {
        int a[]={4,6,1,2,4,9,1,5};

        Set<Integer> set=new LinkedHashSet<>();
        for (int i=0;i<a.length;i++){
            set.add(a[i]);
        }
  int []uniqueArray=new int[set.size()];
        List<Integer> list=new ArrayList<>(set);
        for (int i=0;i<list.size();i++){
           uniqueArray[i]=list.get(i);
        }
        System.out.println("Arrays without duplicate element"+Arrays.toString(uniqueArray));
    }
}
