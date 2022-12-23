import java.util.ArrayList;

public class Employee implements EmpPrototype{
    
    private ArrayList<String> empName;

    public Employee(ArrayList<String> empName) {
        this.empName = empName;
        // this.empName.add("A");
        // this.empName.add("B");
        // this.empName.add("C");

    }

    public void addEmployee(String name) {
        this.empName.add(name);
    }

    public Prototype getClone() {
        return new Employee(new ArrayList<>(this.empName));
    }

    public void getRecord() {
        System.out.println("\n\n");
        for (String i : this.empName) {
            System.out.println(i);
        }
        System.out.println("\n\n");
    }


}
