public class Cricket extends GameTemplate{
    @Override
    public void initialize() {
        System.out.println("Initializing Cricket to play...");
    }

    @Override
    public void start() {
        System.out.println("Start playing Cricket.");
    }

    @Override
    public void finish() {
        System.out.println("Terminating playing Cricket...");
    }
}
