package Arrays;

public class MissingElementmorethanOne {
    public static void main(String[] args) {
        int []a={1,8,5,3,7};
        int max=a[0];
        for(int i=0;i<a.length;i++) {
            if (a[i] > max) {
                max = a[i];
            }

        }
        int[] register = new int[max + 1];
            for (int i=0;i<a.length;i++){
                register[a[i]]=1;
            }
            for (int i=1;i<a.length;i++){
                if(register[i]==0){
                    System.out.println(i);
                }
            }
        }
    }

