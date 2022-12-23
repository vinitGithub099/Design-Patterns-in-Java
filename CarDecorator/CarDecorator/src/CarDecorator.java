public abstract class CarDecorator implements Car {

    protected Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }

    public void buildCar() {
        System.out.println("CarDecorator");
    }
}
