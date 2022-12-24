public class Scoreboard extends Observer {
    
    private static int score = 0;
    private Subject s;

    public void update() {
        this.score = this.score + 1;
        this.s.notifysUsers();
    }

    public void setSubject(Subject s) {
        this.s = s;
    }

    public void notifyMessage() {
        System.out.println("Received ScoreBoard score is " + this.score);
    }
}
