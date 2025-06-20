package Interface.Multilevel;

public interface I2 {

    void playSong();

    void stopSong();

    static void start(){
        System.out.println("car is Start");
    }

    default void dance(){
        System.out.println(" iam dancing ");
    }
}
