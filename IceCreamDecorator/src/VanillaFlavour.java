public class VanillaFlavour extends IceCreamDecorator {

    public VanillaFlavour(IceCream icr) {
        super(icr);
    }

    @Override
    public void addFlavour() {
        super.icr.addFlavour();
        System.out.println("Vanilla Flavour added");
    }

    @Override
    public void getIcecream() {
        this.addFlavour();
    }
}
