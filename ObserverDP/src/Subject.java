import java.util.ArrayList;

public class Subject {
    ArrayList<Observer> obsArr = new ArrayList<>();


    public void addUser(Observer obj) {
        obsArr.add(obj);
    }

    public void removeUser(Observer obj) {
        obsArr.remove(obj);
    }

    public void notifysUsers() {
        for (Observer obj : obsArr) {
            obj.update();
        }
    }
}
