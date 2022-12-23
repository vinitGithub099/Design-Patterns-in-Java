import java.util.ArrayList;

public class Composite implements Employee {

    ArrayList<Employee> arr = new ArrayList<>();


    public void showEmployeeDetails() {
        for (Employee e: arr) {
            e.showEmployeeDetails();
        }
    }

    public void addEmployee(Employee e) {
        arr.add(e);
    }

    public void removeEmployee(Employee e) {
        arr.remove(e);
    }
}
