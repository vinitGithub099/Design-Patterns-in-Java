public class App {
    public static void main(String[] args) throws Exception {

        Chain chain1 = new Chain(20);
        Chain chain2 = new Chain(-20);
        Chain chain3 = new Chain(0);
        chain1.process();
        chain2.process();
        chain3.process();
    }
}
