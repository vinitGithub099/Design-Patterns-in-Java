public class NotificationFactory {

    public Notifications createNotification(String s) {
        if (s.equals("Email")) {
            return new EmailNotifications(s);
        }
        else if (s.equals("Push")) {
            return new PushNotifications(s);

        }
        else if (s.equals("SMS")) {
            return new SMSNotifications(s);
        }
        return null;

    }
}
