public class Chess implements Prototype{
    private int cols, rows;

    public Chess(int rows, int cols) {
        this.cols = cols;
        this.rows = rows;
    }

    public Prototype getClone() {
        return new Chess(this.rows, this.cols);
    }

    public void getRecord() {
        System.out.println("Chess Record");
    }
}
