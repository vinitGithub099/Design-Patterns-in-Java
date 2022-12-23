public class App {
    public static void main(String[] args) throws Exception {

        Prototype p = new Chess(8, 8);
        Prototype q = new TicTacToe(5, 5);

        TicTacToe t = (TicTacToe)q.getClone();
        Chess c = (Chess)p.getClone();

        t.getRecord();
        c.getRecord();
    }
}
