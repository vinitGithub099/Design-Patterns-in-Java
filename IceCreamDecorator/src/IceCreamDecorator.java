public abstract class IceCreamDecorator implements IceCream {
    protected IceCream icr;

    public IceCreamDecorator(IceCream icr) {
        this.icr = icr;
    }

    public void addFlavour() {

    }

    public void getIcecream() {
        
    }
}
