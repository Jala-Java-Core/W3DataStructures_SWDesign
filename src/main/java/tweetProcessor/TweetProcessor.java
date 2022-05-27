package tweetProcessor;

public class TweetProcessor {

    // Code W3-2
    protected StateFinder stateFinder;
    protected StateFileReader stateFileReader;

    public TweetProcessor() {
        stateFinder  = new StateFinder();
        stateFileReader = new StateFileReader();
        stateFinder.setStateReader(stateFileReader);
        stateFileReader.getAllStates(stateFinder);
    }
}
