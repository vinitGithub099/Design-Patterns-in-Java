public class SGDDecorator extends Decorator {
  // Curre
  // int x;ncy currency; IMP
  public SGDDecorator(Currency currency) {
    super.component = currency;
  }

  public String getDescription() {
    return super.component.getDescription() + " ,its Decorated singapore Dollar";
  }

  public double cost(double value) {
    super.cost(value);
    return value;
  }
}
