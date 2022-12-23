public class Product {
    
    private String name;
    private int cost;

    public Product(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    public int getCost() {
        return this.cost;
    }

    public String getName() {
        return this.name;
    }

}
