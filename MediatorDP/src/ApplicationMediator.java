import java.util.ArrayList;

public class ApplicationMediator implements Mediator {

    private ArrayList<Bidder> arr;
    
    public void send(int productValue, Auctioner auctioner) {
        auctioner.send(arr, productValue);
    }

    public void applicationMediator() {
        arr = new ArrayList<>();
    }

    public void addBidder(Bidder bidder) {
        arr.add(bidder);
    }

}
