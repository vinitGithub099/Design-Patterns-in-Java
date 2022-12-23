public class BasicCone implements IceCream {

    @Override
    public void addFlavour() {
        System.out.println("Basic cone ice-cream built");
    }

    @Override
    public void getIcecream() {
        this.addFlavour();
    }
}
