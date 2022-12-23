public class StatsBoard extends Observer {
    
    private int stats;

    public void update() {
        this.stats = this.stats + 1;
    }
}
