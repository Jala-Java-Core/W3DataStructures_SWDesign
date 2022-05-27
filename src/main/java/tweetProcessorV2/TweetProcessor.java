package tweetProcessorV2;

import tweetProcessor.StateFileReader;
import tweetProcessor.StateFinder;

public class TweetProcessor {

    // code W3-3  refactor
    protected StateFinder stateFinder;
    public TweetProcessor() {
        stateFinder = new StateFinder();
    }

    public String getMostPopularHashtagForState(State state) {
        return "";
    }
}
