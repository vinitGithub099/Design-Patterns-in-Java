import java.util.ArrayList;

public class Cart {
    private ArrayList<Product> arr;

    public Cart() {
        arr = new ArrayList<>();
    }

    public void addItem(Product p) {
        arr.add(p);
    }

    public void removeItem(Product p) {
        arr.add(p);
    }

    public int getTotalCost() {
        int totalCost = 0;
        for (Product p : arr) {
            totalCost += p.getCost();
        }

        return totalCost;
    }

    public void Pay(PaymentStrategy p) {
        int totalCost = this.getTotalCost();
        p.makePayment(p, totalCost);
    }
}
