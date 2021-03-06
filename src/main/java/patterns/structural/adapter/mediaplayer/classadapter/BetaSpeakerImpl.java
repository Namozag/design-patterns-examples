package patterns.structural.adapter.mediaplayer.classadapter;

/**
 *
 * @author Hany
 */
public class BetaSpeakerImpl implements BetaSpeaker {
    
    private int volume = 5;

    @Override
    public void start() {
        System.out.println("BetaSpeakerImpl::start");
    }

    @Override
    public void stop() {
        System.out.println("BetaSpeakerImpl::stop");
    }

    @Override
    public int increaseVolume() {
        System.out.println("BetaSpeakerImpl::increaseVolume");
        return ++ volume;
    }

    @Override
    public int decreaseVolume() {
        System.out.println("BetaSpeakerImpl::decreaseVolume");
        return -- volume;
    }
    
}
