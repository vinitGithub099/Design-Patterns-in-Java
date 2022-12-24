public class Silent implements State {

    @Override
    public void notifyState() {
        System.out.println("Mobile is in silent state");
    }
    
}
