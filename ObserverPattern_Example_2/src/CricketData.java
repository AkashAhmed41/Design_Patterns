import java.util.ArrayList;
//import java.util.List;

public class CricketData implements Subject{
    int runs, wickets;
    float overs;
    ArrayList<Observer> observers = new ArrayList<Observer>();

//    public CricketData(){
//        observers = new ArrayList<Observer>();
//    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void unregisterObserver(Observer o) {
        observers.remove(o); //observers.indexOf(o)
    }

    @Override
    public void notifyObservers() {
        for(Observer o : observers)
            o.update(runs,wickets,overs);
    }
    private int getLatestRuns(){
        return 90;
    }
    private int getLatestWickets(){
        return 2;
    }
    private float getLatestOvers(){
        return (float)10.2;
    }

    public void dataChanged(){
        runs = getLatestRuns();
        wickets = getLatestWickets();
        overs = getLatestOvers();
        notifyObservers();
    }
}
