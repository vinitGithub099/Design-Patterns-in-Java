public class Handler3 extends Handler {

    public Handler3(int number, Handler nextHandler) {
        super(number, nextHandler);
    }

    // @Override
    // public void setNextHandler(Handler handler) {
    //     super.setNextHandler(handler);
    // }

    @Override
    public void process() {
        System.out.println("3");
        if (super.getNumber() > 0) {
            System.out.println("handled by handler3");
        }
        else {
            super.process();
        }
    }

}
