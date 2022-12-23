public class StrawberryFlavour extends IceCreamDecorator {

    public StrawberryFlavour(IceCream icr) {
        super(icr);
    }

    @Override
    public void addFlavour() {
        super.icr.addFlavour();
        System.out.println("Strawberry Flavour added");
    }

    @Override
    public void getIcecream() {
        this.addFlavour();
    }
}
