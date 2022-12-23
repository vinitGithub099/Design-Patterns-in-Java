public class App {
    public static void main(String[] args) throws Exception {

        StudentCollection s = new StudentCollection();
        s.addItem(new Students("A"));
        s.addItem(new Students("B"));
        s.addItem(new Students("C"));
        s.addItem(new Students("D"));
        Iterator studenIterator = s.createIterator();

        while (studenIterator.hasNext()) {
            System.out.println(studenIterator.next());
        }

    }
}
