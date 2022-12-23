public class SMSNotifications implements Notifications {

    private String msg;

    public SMSNotifications(String msg) {
        this.msg = msg;
    }

    public void getNotification() {
        System.out.println(msg + " notification");
    }
}
