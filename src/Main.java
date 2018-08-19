import command.MusicPlayer;
import command.PlayFirstTrackCommand;
import command.PlayNextTrackCommand;
import command.PlayRandomTrackCommand;

public class Main {
        public static void main(String[] argv){
            MusicPlayer musicPlayer = new MusicPlayer();
            MusicPlayerRemote remote = new MusicPlayerRemote();
            remote.setMusicPlayerCommand(new PlayFirstTrackCommand(musicPlayer));
            remote.pressButton();
            remote.setMusicPlayerCommand(new PlayNextTrackCommand(musicPlayer));
            remote.pressButton();
            remote.pressButton();
            remote.pressButton();
            remote.setMusicPlayerCommand(new PlayFirstTrackCommand(musicPlayer));
            remote.pressButton();
            remote.pressButton();
            System.out.println("RAND");
            remote.setMusicPlayerCommand(new PlayRandomTrackCommand(musicPlayer));
            remote.pressButton();
            remote.pressButton();
            remote.pressButton();
            remote.pressButton();
        }
}
