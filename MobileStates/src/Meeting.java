public class Meeting implements State {

    @Override
    public void notifyState() {
        System.out.println("Mobile is in meeting state");
    }
    
}
