public class Leaf implements Employee {

    private int id;
    private String name;
    private String position;

    public Leaf(int id, String name, String position) {
        this.name = name;
        this.position = position;
        this.id = id;
    }

    public void addEmployee(Employee e) {

    }

    public void removeEmployee(Employee e) {

    }

    public void showEmployeeDetails() {
        System.out.println(this.id + "  " + this.name + "  " + this.position);
    }
}
