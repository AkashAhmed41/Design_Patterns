import java.util.ArrayList;

public class DeliveryData implements Subject{
    ArrayList<Observer> observers = new ArrayList<Observer>();

    private String location;
    public String getLocation(){
        return "Bhairab";
    }

    public void locationChanged(){
        this.location = getLocation();
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer obj) {
        observers.add(obj);
    }

    @Override
    public void unregisterObserver(Observer obj) {
        observers.remove(obj);
    }

    @Override
    public void notifyObservers() {
        for(Observer obj : observers)
            obj.update(location);
    }
}
