package tweetProcessorV2;

import tweetProcessor.State;
import tweetProcessor.Tweet;

public class StateFinder {

    // Code W3-3
    protected State[] allStates;
    protected StateFileReader stateReader;

    public StateFinder() {
        stateReader = new StateFileReader();
        allStates = stateReader.getAllStates();
    }

    public String determineState(Tweet tweet) {
        return "";
    }
}
