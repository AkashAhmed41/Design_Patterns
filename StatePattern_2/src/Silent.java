public class Silent implements AlertState{
    @Override
    public void alert(Context context) {
        System.out.println("Phone is on Silent State...");
        context.setAlertState(this);
    }

    public String toString() {
        return "Silent Mood On.";
    }
}