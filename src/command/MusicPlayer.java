package command;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MusicPlayer {
    private List<String> tracks = Arrays.asList("Track 1", "Track 2", "Track 3");
    private int currentTrack = 0;

    void playFirstTrack(){
        currentTrack = 0;
        System.out.println("Song number: " + tracks.get(currentTrack) + "is hearing");
    }

    void playNextTrack(){
        currentTrack++;
        if (currentTrack > 2) {
            currentTrack = 0;
        }
        System.out.println("Song number: " + tracks.get(currentTrack) + "is hearing");
    }

    void playRandomTrack(){
        Random generator = new Random();
        int currentTrack = generator.nextInt(3);
        System.out.println("Song number: " + tracks.get(currentTrack) + "is hearing");
    }

}
