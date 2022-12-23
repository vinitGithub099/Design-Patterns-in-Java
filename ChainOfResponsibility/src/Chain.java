public class Chain {
    
    private Handler handler;

    public Chain(int number) {
        buildChain(number);

    }

    public void buildChain(int number) {
        this.handler = new Handler1(number, new Handler2(number, new Handler3(number, null)));
    }

    public void process() {
        handler.process();
    }


}
