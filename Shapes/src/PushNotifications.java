public class PushNotifications implements Notifications {

    private String msg;

    public PushNotifications(String msg) {
        this.msg = msg;
    }

    public void getNotification() {
        System.out.println(msg + " notification");
    }
}
