import command.MusicPlayerCommand;

public class MusicPlayerRemote {
    private MusicPlayerCommand musicPlayerCommand;

    public void pressButton(){
        musicPlayerCommand.play();
    }

    public void setMusicPlayerCommand(MusicPlayerCommand musicPlayerCommand) {
        this.musicPlayerCommand = musicPlayerCommand;
    }
}
