// Factory design pattern

public class App {
    public static void main(String[] args) throws Exception {
        
        NotificationFactory n = new NotificationFactory();
        Notifications nobj1 = n.createNotification("Email");
        nobj1.getNotification();
        Notifications nobj2 = n.createNotification("SMS");
        nobj2.getNotification();
        Notifications nobj3 = n.createNotification("Push");
        nobj3.getNotification();
    }
}
