public class ColoredAnimal extends AbstractFactory{
    @Override
    Animal getAnimal(String animalType) {
        if(animalType.equalsIgnoreCase("Dog")){
            return new BlackDog();
        }
        else if(animalType.equalsIgnoreCase("Cat")){
            return new BlackCat();
        }
        return null;
    }
}
