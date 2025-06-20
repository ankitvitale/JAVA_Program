package Interface;

public class SmartPhone implements Camera,MXPlayer,Phone{


//    @Override
//    public void recordVideo() {
//        System.out.println(" record the video");
//
//    }

    @Override
    public void playSong() {
        System.out.println("play Song");
    }

    @Override
    public void StopSong() {
        System.out.println("Stop Song");

    }

    @Override
    public void makeCall() {
        System.out.println("Make Call");
    }

    @Override
    public void endCall() {
        System.out.println("end call");
    }
}
