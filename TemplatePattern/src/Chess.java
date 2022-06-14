public class Chess extends GameTemplate{
    @Override
    public void initialize() {
        System.out.println("Initializing Chess to play...");
    }

    @Override
    public void start() {
        System.out.println("Start playing Chess.");
    }

    @Override
    public void finish() {
        System.out.println("Terminating playing Chess...");
    }
}
