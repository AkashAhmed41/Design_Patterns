public class StopState implements State{
    @Override
    public void doAction(Context context) {
        System.out.println("Executing the Stop State...");
        context.setState(this);
    }

    public String toString() {
        return "Stop State";
    }
}
