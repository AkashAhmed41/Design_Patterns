public class NotificationFactory {

    public Notification createNotification(String type){
        if(type==null)
            return null;
        if(type.equalsIgnoreCase("SMS"))
            return new SMSNotification();
        else if(type.equalsIgnoreCase("Email"))
            return new EmailNotification();
        else if(type.equalsIgnoreCase("Call"))
            return new CallNotification();
        return null;
    }
}
