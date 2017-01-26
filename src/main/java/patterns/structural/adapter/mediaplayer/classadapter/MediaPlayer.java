package patterns.structural.adapter.mediaplayer.classadapter;

/**
 *
 * @author Hany
 */
public class MediaPlayer {
    
    private AlphaSpeaker speaker;
    
    public void connectSpeaker(AlphaSpeaker speaker) {
        this.speaker = speaker;
    }
    
    public void disConnectSpeaker() {
        this.speaker = null;
    }
    
    public void pressPlayButton() {
        speaker.play();
    }
    
    public void pressStopButton() {
        speaker.stop();
    }
    
    public void pressVolumeUpButton() {
        speaker.volumeUp();
    }
    
    public void pressVolumeDownButton() {
        speaker.volumeDown();
    }
    
}
