import java.util.ArrayList;

public class StudentCollection implements Container {

    private ArrayList<Students> arr;

    public StudentCollection() {
        this.arr = new ArrayList<>();;
    }

    public void addItem(Students obj) {
        this.arr.add(obj);
    }

    @Override
    public Iterator createIterator() {
        // TODO Auto-generated method stub
        return new StudentIterator(arr);
    }
    
}
