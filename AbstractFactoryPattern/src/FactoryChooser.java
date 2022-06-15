public class FactoryChooser {
    public static AbstractFactory getFactory(boolean rounded){
        if(rounded){
            return new RoundedFactory();
        }
        else{
            return new ShapeFactory();
        }
    }
}
