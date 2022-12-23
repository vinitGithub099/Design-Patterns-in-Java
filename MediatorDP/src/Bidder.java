public abstract class Bidder {
    private Mediator mediator;
    private int currProductValue;

    public Bidder(Mediator mediator) {
        this.mediator = mediator;
    }

    public int send(int bid) {
        return bid;
    }

    public void receive(int currProductValue) {
        this.currProductValue = currProductValue;
    }

}
