public class DemoClass {
    private static final String colors[] = {"Red", "Black", "White", "Blue", "Green"};

    public static void main(String[] args) {
        for(int i=0; i<25; i++){
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setRadius(getRandomRadius());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.draw();
        }
    }

    private static int getRandomY() {
        return (int)(Math.random()*100);
    }

    private static int getRandomX() {
        return (int)(Math.random()*100);
    }

    private static int getRandomRadius() {
        return (int)(Math.random()*100);
    }

    private static String getRandomColor() {
        return colors[(int)(Math.random()* colors.length)];
    }
}