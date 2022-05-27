package tweetProcessor;

public class StateFinder {

    // Code W3-3
    public State[] allStates;
    protected StateFileReader stateReader;

    public StateFinder() {
        stateReader = new StateFileReader();
        allStates = stateReader.getAllStates();
    }

    public State determineState(Tweet tweet) {
        return new State();
    }

    public void setStateReader(StateFileReader stateFileReader) {
    }
}
