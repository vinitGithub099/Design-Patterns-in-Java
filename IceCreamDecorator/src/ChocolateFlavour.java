public class ChocolateFlavour extends IceCreamDecorator {

    public ChocolateFlavour(IceCream icr) {
        super(icr);
    }

    @Override
    public void addFlavour() {
        super.icr.addFlavour();
        System.out.println("Chocolate Flavour added");
    }

    @Override
    public void getIcecream() {
        this.addFlavour();
    }
}
