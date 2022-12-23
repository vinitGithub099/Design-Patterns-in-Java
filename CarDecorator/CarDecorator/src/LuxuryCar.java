public class LuxuryCar extends CarDecorator {
    
    public LuxuryCar(Car car) {
        super(car);
    }

    @Override
    public void buildCar() {
        super.car.buildCar();
        System.out.println("LuxuryCar features added");
    }

}
