public class MobileStateContext {
    
    private State currentState;

    public MobileStateContext() {
        this.currentState = new Vibration();
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public void getCurrentState() {
        this.currentState.notifyState();
    }

}
