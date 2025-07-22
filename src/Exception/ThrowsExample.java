package Exception;

import java.io.IOException;

public class ThrowsExample  {
    public static void main(String[] args) {

        try{
            readFile();
        }catch (Exception e){
            System.out.println("Caught exception: "+e.getMessage());
        }


    }

    private static void readFile() throws IOException {
        throw new IOException("File not found");
    }
}
