public abstract class Handler {

    private Handler nextHandler;
    private int number;

    public Handler(int number, Handler nextHandler) {
        this.setNextHandler(nextHandler);
        this.number = number;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public int getNumber() {
        return this.number;
    }

    public void process() {
        if (nextHandler != null)
            this.nextHandler.process();
        else
            System.out.println("Chain ended");
    };
}
