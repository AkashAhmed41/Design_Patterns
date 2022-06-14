public class Football extends GameTemplate{
    @Override
    public void initialize() {
        System.out.println("Initializing Football to play...");
    }

    @Override
    public void start() {
        System.out.println("Start playing Football.");
    }

    @Override
    public void finish() {
        System.out.println("Terminating playing Football...");
    }
}
