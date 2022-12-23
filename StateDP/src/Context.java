public class Context {
    State s;

    Context() {
        s = new Start();
    }

    public void change_state(State newState) {
        if (s.getClass().getName() == "Shutdown" && newState.getClass().getName() == "Restart") {
            System.out.println("Cannot restart, already in shutdown state...");
            return;
        }
        s = newState;
        s.work(this);
    }

    public void work() {
        System.out.println("processing.....");
        // s.work(this);
    }
}
