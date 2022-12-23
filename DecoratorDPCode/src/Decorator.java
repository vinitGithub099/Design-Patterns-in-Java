public abstract class Decorator extends Currency {
    Currency component;

    public abstract String getDescription();

    public double cost(double value) {
        return component.cost(value);
    }
}
