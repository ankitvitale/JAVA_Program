package OOps.Inheritance;

public class Parant extends Grandparant{
    private String city;


    Parant(){
        System.out.println("Parant Constructor");

    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void eat(){
        System.out.println("Chapati ");
    }
}
