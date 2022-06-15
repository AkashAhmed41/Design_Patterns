public class FactoryProvider {
    public static AbstractFactory getFactory(boolean choice){
        if(choice){
            return new ColoredAnimal();
        }
        else{
            return new NormalAnimal();
        }
    }
}
