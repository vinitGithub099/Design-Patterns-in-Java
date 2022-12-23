public interface Mediator {

    public void applicationMediator();

    public void send(int productValue, Auctioner auctioner);

    public void addBidder(Bidder bidder);
}
