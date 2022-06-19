public class Test {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        Shape redDashedRectangle = new DashedBorderDecorator(new RedShapeDecorator(new Rectangle()));
        System.out.println("Circle with normal border: ");
        circle.draw();
        System.out.println();
        System.out.println("Circle with Red border: ");
        redCircle.draw();
        System.out.println();
        System.out.println("Rectangle with Red border: ");
        redRectangle.draw();
        System.out.println();
        System.out.println("Dashed bordered Red Rectangle: ");
        redDashedRectangle.draw();
        System.out.println();
        Shape redDashedCircle = new RedShapeDecorator(new DashedBorderDecorator(new Circle()));
        System.out.println("Dashed bordered Red Circle: ");
        redDashedCircle.draw();
    }
}
