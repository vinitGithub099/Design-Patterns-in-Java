public class App {
    public static void main(String[] args) throws Exception {

        Employee parent = new Leaf(101, "Head", "Top");
        Employee child1 = new Leaf(201, "child1", "Middle");
        Employee child2 = new Leaf(202, "child2", "Middle");
        Employee grandChild11 = new Leaf(301, "grandChild11", "Bottom");
        Employee grandChild12 = new Leaf(302, "grandChild12", "Bottom");
        Employee grandChild13 = new Leaf(303, "grandChild13", "Bottom");
        Employee grandChild21 = new Leaf(304, "grandChild21", "Bottom");
        Employee grandChild22 = new Leaf(305, "grandChild22", "Bottom");
        Employee grandChild23 = new Leaf(306, "grandChild23", "Bottom");

        Employee parentTeam = new Composite();
        Employee child1Team = new Composite();
        Employee child2Team = new Composite();

        parentTeam.addEmployee(parent);
        parentTeam.addEmployee(child1Team);
        parentTeam.addEmployee(child2Team);

        child1Team.addEmployee(child1);
        child1Team.addEmployee(grandChild11);
        child1Team.addEmployee(grandChild12);
        child1Team.addEmployee(grandChild13);

        child2Team.addEmployee(child2);
        child2Team.addEmployee(grandChild21);
        child2Team.addEmployee(grandChild22);
        child2Team.addEmployee(grandChild23);

        parentTeam.showEmployeeDetails();
        System.out.println("\n\n\n");
        child1Team.showEmployeeDetails();
        System.out.println("\n\n\n");
        child2Team.showEmployeeDetails();
    }

}
