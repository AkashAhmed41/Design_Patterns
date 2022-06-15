public class NormalAnimal extends AbstractFactory{
    @Override
    Animal getAnimal(String animalType) {
        if(animalType.equalsIgnoreCase("Dog")){
            return new Dog();
        }
        else if(animalType.equalsIgnoreCase("Cat")){
            return new Cat();
        }
        return null;
    }
}
