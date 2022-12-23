public class App {
    public static void main(String[] args) throws Exception {

        Car SportsLuxuryCar = new SportsCar(new LuxuryCar(new SimpleCar()));
        SportsLuxuryCar.buildCar();

        System.out.println("\n\n");
        
        Car simpleCar = new SimpleCar();
        simpleCar.buildCar();
        
        System.out.println("\n\n");
        
        Car sportsCar = new SportsCar(new SimpleCar());
        sportsCar.buildCar();
        
        System.out.println("\n\n");
        
        Car luxuryCar = new LuxuryCar(new SimpleCar());
        luxuryCar.buildCar();

    }
}
