public class App {
    public static void main(String[] args) throws Exception {
        Context c = new Context();
        c.work();

        //changing state to shutdown
        c.change_state(new Shutdown());
        c.work();

        //changing state to start
        c.change_state(new Start());
        c.work();

        //changing state to restart
        c.change_state(new Restart());
        c.work();

        //changing state to shutdown
        c.change_state(new Shutdown());
        c.work();

        //changing state to restart
        c.change_state(new Restart());
        c.work();

    }
}
