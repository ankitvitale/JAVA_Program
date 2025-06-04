package StringBasic;

public class StringDay1 {
    public static void main(String[] args) {
        String name="ankit";
        String sameName="ankit";
        String newName=new String("Ankit");

        if(name.equalsIgnoreCase(newName)){
            System.out.println("both are same");
        }else {
            System.out.println("both are not same");
        }


//       System.out.println(name);
//        System.out.println(sameName);
//        System.out.println(newName);

//
//        if(name==sameName){
//            System.out.println("both are same");
//        }else{
//            System.out.println("not same");
//        }

//        if(name==newName){
//            System.out.println("both are same");
//        }else {
//            System.out.println("both are not same");
//        }



//        if(name.equalsIgnoreCase(newName)){
//            System.out.println("both are same");
//        }else {
//            System.out.println("both are not same");
//        }
    }
}
