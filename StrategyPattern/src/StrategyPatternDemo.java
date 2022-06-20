public class StrategyPatternDemo {

    public static void main(String[] args) {
        Context context = new Context(new Addition());
        System.out.println("Addition = "+context.executeStrategy(10, 5));

        context = new Context(new Subtraction());
        System.out.println("Subtraction = "+context.executeStrategy(10, 5));

        context = new Context(new Multiplication());
        System.out.println("Multiplication = "+context.executeStrategy(10, 5));
    }
}
