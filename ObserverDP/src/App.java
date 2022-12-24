public class App {
    public static void main(String[] args) throws Exception {

        Subject mySubject1 = new Subject();

        Observer osb1 = new Scoreboard();
        Observer osb2 = new Scoreboard();
        Observer osb3 = new Scoreboard();
        Observer osb4 = new Scoreboard();
        mySubject1.addUser(osb1);
        mySubject1.addUser(osb2);
        mySubject1.addUser(osb3);
        mySubject1.addUser(osb4);
        osb1.setSubject(mySubject1);
        osb2.setSubject(mySubject1);
        osb3.setSubject(mySubject1);
        osb4.setSubject(mySubject1);
        osb1.update();
        osb2.update();
        osb2.update();


        Subject mySubject2 = new Subject();


        Observer ostb1 = new StatsBoard();
        Observer ostb2 = new StatsBoard();
        Observer ostb3 = new StatsBoard();
        Observer ostb4 = new StatsBoard();
        mySubject2.addUser(ostb1);
        mySubject2.addUser(ostb2);
        mySubject2.addUser(ostb3);
        mySubject2.addUser(ostb4);
        ostb1.setSubject(mySubject2);
        ostb2.setSubject(mySubject2);
        ostb3.setSubject(mySubject2);
        ostb4.setSubject(mySubject2);
        ostb1.update();
        ostb3.update();
        ostb4.update();
    }
}
