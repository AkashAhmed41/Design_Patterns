public class Main {
    public static void main(String[] args) {
        AverageScoreDisplay averageScoreDisplay = new AverageScoreDisplay();
        CurrentScoreDisplay currentScoreDisplay = new CurrentScoreDisplay();
        CricketData cricketData = new CricketData();

        cricketData.registerObserver(averageScoreDisplay);
        cricketData.registerObserver(currentScoreDisplay);
        CurrentScoreDisplay ob1 = new CurrentScoreDisplay();
        cricketData.registerObserver(ob1);

        //cricketData.dataChanged();
        cricketData.unregisterObserver(averageScoreDisplay);

        //cricketData.dataChanged();
        cricketData.unregisterObserver(currentScoreDisplay);
        cricketData.dataChanged();
    }
}
