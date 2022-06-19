public class BubbleLights extends TreeDecoration{
    public BubbleLights(ChristmasTree tree){
        super(tree);
    }

    @Override
    public String decorate() {
        return super.decorate()+withBubbleLights();
    }

    public String withBubbleLights(){
        return " with Bubble Lights";
    }
}
