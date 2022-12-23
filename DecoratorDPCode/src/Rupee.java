public class Rupee extends Currency {
    double value;

    public Rupee() {
        description = "indian rupees";
        value = 1.0;
    }

    public double cost(double v) {
        value = v;
        return value;
    }
}
