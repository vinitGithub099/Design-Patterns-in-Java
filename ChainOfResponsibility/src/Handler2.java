public class Handler2 extends Handler {
    
    public Handler2(int number, Handler nextHandler) {
        super(number, nextHandler);
    }

    // @Override
    // public void setNextHandler(Handler handler) {
    //     super.setNextHandler(handler);

    // }

    @Override
    public void process() {
        System.out.println("2");
        if (super.getNumber() == 0) {
            System.out.println("handled by handler2");
        }
        else {
            super.process();
        }
    }

}
