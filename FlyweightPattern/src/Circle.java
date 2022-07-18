public class Circle implements Shape{
    private String color;
    private int radius, x, y;

    public Circle(String color) {
        this.color = color;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle with color : "+color+", Radius : "+radius+", X : "+x+", Y : "+y);
    }
}