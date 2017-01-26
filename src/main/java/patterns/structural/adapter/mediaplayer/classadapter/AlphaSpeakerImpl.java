package patterns.structural.adapter.mediaplayer.classadapter;

/**
 *
 * @author Hany
 */
public class AlphaSpeakerImpl implements AlphaSpeaker {

    private int volume = 5;
    
    @Override
    public void play() {
        System.out.println("AlphaSpeakerImpl::play");
    }

    @Override
    public void stop() {
        System.out.println("AlphaSpeakerImpl::stop");
    }

    @Override
    public int volumeUp() {
        System.out.println("AlphaSpeakerImpl::volumeUp");
        return ++ volume;
    }

    @Override
    public int volumeDown() {
        System.out.println("AlphaSpeakerImpl::volumeDown");
        return -- volume;
    }
    
}
