public class Test {
    public static void main(String[] args) {
        ChristmasTree tree = new Garland(new BubbleLights(new Tinsel(new ChristmasTreeImpl())));
        System.out.print(tree.decorate());
        System.out.println(".");
        System.out.println();

        ChristmasTree christmasTree = new BubbleLights(new Tinsel(new Garland(new BubbleLights(new Garland(new ChristmasTreeImpl())))));
        System.out.print(christmasTree.decorate());
        System.out.println(".");
    }
}
