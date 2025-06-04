package StringBasic;

public class ReverseString {
    public static void main(String[] args) {
        String str= "sanket";
        char[] s=str.toCharArray();
        for (int i=s.length-1;i>=0;i--){
            System.out.print(s[i]);
        }



//        String str="ankit";
//        String r="";
//        char ch;
//        for(int i=0;i<str.length();i++){
//            ch=str.charAt(i);
//            r=ch+r;
//        }
//        System.out.println(r);
    }

}
