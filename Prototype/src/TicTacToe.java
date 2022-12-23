public class TicTacToe implements Prototype {
    private int cols, rows;

    public TicTacToe(int rows, int cols) {
        this.cols = cols;
        this.rows = rows;
    }

    public Prototype getClone() {
        return new TicTacToe(this.rows, this.cols);
    }

    public void getRecord() {
        System.out.println("TicTacToe Record");
    }
}
