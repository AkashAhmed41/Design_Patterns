public class Demo {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = FactoryChooser.getFactory(false);
        Shape s1 = abstractFactory.getShape("recTangle");
        s1.create();
        Shape s2 = abstractFactory.getShape("SquAre");
        s2.create();

        AbstractFactory abstractFactory1 = FactoryChooser.getFactory(true);
        Shape s3 = abstractFactory1.getShape("RecTangle");
        Shape s4 = abstractFactory1.getShape("SquAre");
        s3.create();
        s4.create();
    }
}
