public abstract class GameTemplate {
    public abstract void initialize();
    public abstract void start();
    public abstract void finish();

    public final void templateMethod(){
        initialize();
        start();
        finish();
    }
}
