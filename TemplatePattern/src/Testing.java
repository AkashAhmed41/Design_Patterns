public class Testing {
    public static void main(String[] args) {
        GameTemplate game1 = new Football();
        game1.templateMethod();
        System.out.println();
        GameTemplate game2 = new Cricket();
        game2.templateMethod();
        System.out.println();
        GameTemplate game3 = new Chess();
        game3.templateMethod();
    }
}
