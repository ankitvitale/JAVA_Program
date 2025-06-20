package Interface.Multilevel;

import Interface.Multilevel.I2;

public class Song implements I2 {
    @Override
    public void playSong() {
        System.out.println("Song Start ...OOOOOOOOOOo");
    }

    @Override
    public void stopSong() {
        System.out.println("Stop Song");
    }
}
