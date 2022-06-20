public class NotificationService {

    public static void main(String[] args) {
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification SMS = notificationFactory.createNotification("Sms");
        SMS.notifyUser();

        Notification Call = notificationFactory.createNotification("Call");
        Call.notifyUser();

        Notification Email = notificationFactory.createNotification("Email");
        Email.notifyUser();
    }
}
