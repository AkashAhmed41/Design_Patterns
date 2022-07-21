public class TestingDemo {
    public static void main(String[] args) {
        Context context = new Context();

        System.out.println(context.getAlertState());
        Vibrate vibrate = new Vibrate();
        vibrate.alert(context);
        System.out.println(context.getAlertState().toString());

        Silent silent = new Silent();
        silent.alert(context);
        System.out.println(context.getAlertState().toString());

        Vibrate vibrate1 = new Vibrate();
        vibrate1.alert(context);
        System.out.println(context.getAlertState().toString());
    }
}
