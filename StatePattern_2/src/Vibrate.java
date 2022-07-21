public class Vibrate implements AlertState{
    @Override
    public void alert(Context context) {
        System.out.println("Phone is on Vibrate State...");
        context.setAlertState(this);
    }

    public String toString() {
        return "Vibration Mood On.";
    }
}
