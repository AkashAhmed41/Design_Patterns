public abstract class TreeDecoration implements ChristmasTree{
    private ChristmasTree tree;

    public TreeDecoration(ChristmasTree tree) {
        this.tree = tree;
    }

    @Override
    public String decorate() {
        return tree.decorate();
    }
}
