public class Handler1 extends Handler{

    public Handler1(int number, Handler nexHandler) {
        super(number, nexHandler);
    }

    // @Override
    // public void setNextHandler(Handler handler) {
    //     super.setNextHandler(handler);
    // }

    @Override
    public void process() {
        System.out.println("1");
        if (super.getNumber() < 0) {
            System.out.println("handled by handler1");
        }
        else {
            super.process();
        }
    }
    
}
