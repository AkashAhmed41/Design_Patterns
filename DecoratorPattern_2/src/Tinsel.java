public class Tinsel extends TreeDecoration{
    public Tinsel(ChristmasTree tree) {
        super(tree);
    }

    @Override
    public String decorate() {
        return super.decorate()+withTinsel();
    }

    public String withTinsel(){
        return " with Tinsel";
    }
}
