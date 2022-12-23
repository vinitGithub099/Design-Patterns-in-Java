public class SportsCar extends CarDecorator {

    public SportsCar(Car car) {
        super(car);
    }

    @Override
    public void buildCar() {
        super.car.buildCar();
        System.out.println("SportsCar features added");
    }
}
