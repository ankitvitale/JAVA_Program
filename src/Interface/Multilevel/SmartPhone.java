package Interface.Multilevel;

public class SmartPhone implements Camera,Phone,MusicPlayer{
    @Override
    public void clickPhoto() {
        System.out.println("click photo");
    }

    @Override
    public void recordVideo() {
        System.out.println("Record video");

    }

    @Override
    public void playSong() {
        System.out.println("play song");

    }

    @Override
    public void stopSong() {
        System.out.println("stop song");

    }

    @Override
    public void makeCall() {
        System.out.println("make call ");
    }

    @Override
    public void endCall() {
        System.out.println("end call");

    }
}
