import java.util.ArrayList;

public class StudentIterator implements Iterator {

    private ArrayList<Students> studentList;
    private int pos;

    public StudentIterator(ArrayList<Students> stdList) {
        this.studentList = stdList;
        this.pos = -1;
    }

    @Override
    public boolean hasNext() {
        // TODO Auto-generated method stub
        pos++;
        if (studentList.size() > pos) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        // TODO Auto-generated method stub
        return studentList.get(pos).getName();
    }
    
}
