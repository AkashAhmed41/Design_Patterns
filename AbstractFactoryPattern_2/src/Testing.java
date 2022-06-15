public class Testing {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = FactoryProvider.getFactory(false);
        Animal animal = abstractFactory.getAnimal("dog");
        animal.description();
        Animal animal1 = abstractFactory.getAnimal("cat");
        animal1.description();

        AbstractFactory abstractFactory1 = FactoryProvider.getFactory(true);
        Animal animal2 = abstractFactory1.getAnimal("dog");
        Animal animal3 = abstractFactory1.getAnimal("CaT");
        animal2.description();
        animal3.description();
    }
}
