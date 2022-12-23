public class App {
    public static void main(String[] args) throws Exception {
        
        IceCream vanillaIcecream = new VanillaFlavour(new BasicCone());
        vanillaIcecream.getIcecream();

        System.out.println("\n");
        
        IceCream chocolateVanillaIceCream = new ChocolateFlavour(new VanillaFlavour(new BasicCone()));
        chocolateVanillaIceCream.getIcecream();
        
        System.out.println("\n");
        
        IceCream strawberryVanillaIcecream = new StrawberryFlavour(new VanillaFlavour(new BasicIceCream()));
        strawberryVanillaIcecream.getIcecream();
        
        System.out.println("\n");
        
        IceCream basicIcerCream = new BasicIceCream();
        basicIcerCream.getIcecream();

        System.out.println("\n");

        IceCream basicCone = new BasicCone();
        basicCone.getIcecream();
    }
}
