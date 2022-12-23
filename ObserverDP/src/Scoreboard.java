public class Scoreboard extends Observer {
    
    private static int score = 0;

    public void update() {
        this.score = this.score + 1;
    }

}
