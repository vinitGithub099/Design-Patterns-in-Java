public class StatsBoard extends Observer {
    
    private static int stats = 0;
    private Subject s;

    public void update() {
        this.stats = this.stats + 1;
        this.s.notifysUsers();
    }

    public void setSubject(Subject s) {
        this.s = s;
    }

    public void notifyMessage() {
        System.out.println("Received StatsBoard stats is " + this.stats);
    }
}
