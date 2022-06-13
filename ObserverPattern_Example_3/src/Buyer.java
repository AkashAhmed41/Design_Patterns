public class Buyer implements Observer{
    private String location;

    @Override
    public void update(String location) {
        this.location = location;
        showLocation();
    }

    public void showLocation(){
        System.out.println("Msg to Buyer - Current Location is: "+location);
    }
}
