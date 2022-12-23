import java.util.ArrayList;

public class Auctioner {

    private int productValue;

    public void receiveAndUpdate(int val) {
        this.productValue = val;
    }

    public void send(ArrayList<Bidder> arr, int productValue) {
        for (Bidder b : arr) {
            b.receive(productValue);
        }
    }

}
