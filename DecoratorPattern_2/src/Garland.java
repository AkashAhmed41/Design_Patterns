public class Garland extends TreeDecoration{
    public Garland(ChristmasTree tree) {
        super(tree);
    }

    @Override
    public String decorate() {
        return super.decorate()+withGarland();
    }

    public String withGarland(){
        return " with Garland";
    }
}
