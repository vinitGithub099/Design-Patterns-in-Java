public class BasicIceCream implements IceCream {

    @Override
    public void addFlavour() {
        System.out.println("Basic ice-cream built");
    }
    
    @Override
    public void getIcecream() {
        this.addFlavour();
    }

}
