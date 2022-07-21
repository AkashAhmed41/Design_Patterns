public class TestingDemo {
    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);
        StopState stopState = new StopState();

        System.out.println(context.getState().toString());
        stopState.doAction(context);
        System.out.println(context.getState().toString());

        StartState startState1 = new StartState();
        startState1.doAction(context);
        System.out.println(context.getState().toString());
    }
}
