public class App {
    public static void main(String[] args) throws Exception {
        Pen p1 = new GelPenFactory();
        p1.createRefil();
        p1.createTube();
        Pen p2 = new SketchPenFactory();
        p2.createRefil();
        p2.createTube();
    }
}
