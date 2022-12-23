public class App {
    public static void main(String[] args) throws Exception {


        Product p1 = new Product("A", 12);
        Product p2 = new Product("B", 22);
        Product p3 = new Product("C", 32);
        Product p4 = new Product("D", 42);
        Product p5 = new Product("E", 42);
        Product p6 = new Product("F", 52);

        Cart ct = new Cart();
        ct.addItem(p1);
        ct.addItem(p2);
        ct.addItem(p3);
        ct.addItem(p4);
        ct.addItem(p5);
        ct.addItem(p6);

        ct.Pay(new GPayOption());
    }
}
