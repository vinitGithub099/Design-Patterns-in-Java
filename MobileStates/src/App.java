public class App {
    public static void main(String[] args) throws Exception {

        MobileStateContext msc = new MobileStateContext();
        State vibration = new Vibration();
        State silent = new Silent();
        State meeting = new Meeting();
        msc.getCurrentState();
        msc.getCurrentState();
        msc.setCurrentState(meeting);
        msc.getCurrentState();
        msc.getCurrentState();
        msc.setCurrentState(vibration);
        msc.getCurrentState();
        msc.getCurrentState();
        msc.setCurrentState(silent);
        msc.getCurrentState();
        msc.getCurrentState();
    }
}
