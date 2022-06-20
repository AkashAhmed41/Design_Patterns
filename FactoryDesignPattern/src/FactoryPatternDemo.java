public class FactoryPatternDemo {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape s1 = shapeFactory.getShape("circle");
        s1.draw();

        Shape s2 = shapeFactory.getShape("Rectangle");
        s2.draw();

        Shape s3 = shapeFactory.getShape("Square");
        s3.draw();
    }

}
