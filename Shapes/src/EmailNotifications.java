public class EmailNotifications implements Notifications {

    private String msg;

    public EmailNotifications(String msg) {
        this.msg = msg;
    }

    public void getNotification() {
        System.out.println(msg + " notification");
    }
}
