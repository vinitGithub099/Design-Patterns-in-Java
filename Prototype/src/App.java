import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        // Prototype p = new Chess(8, 8);
        // Prototype q = new TicTacToe(5, 5);

        // TicTacToe t = (TicTacToe)q.getClone();
        // Chess c = (Chess)p.getClone();

        EmpPrototype emp1 = new Employee(new ArrayList<String>());

        emp1.addEmployee("A");
        emp1.addEmployee("B");
        emp1.addEmployee("C");
        emp1.addEmployee("D");
        emp1.addEmployee("E");

        Employee emp2 = (Employee)emp1.getClone();
        emp2.addEmployee("F");
        emp2.addEmployee("G");
        emp2.addEmployee("H");
        
        // t.getRecord();
        // c.getRecord();
        // p.getRecord();
        // q.getRecord();

        emp1.getRecord();
        emp2.getRecord();
    }
}
