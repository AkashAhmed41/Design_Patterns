public class DashedBorderDecorator extends ShapeDecorator{
    public DashedBorderDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setBorderType(decoratedShape);
    }
    public void setBorderType(Shape decoratedShape){
        System.out.println("Border Type: Dashed");
    }
}
