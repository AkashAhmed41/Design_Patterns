public class UsingSingletonClass {
    public static void main(String[] args) {
        SingletonClass obj = SingletonClass.getInstance();

        System.out.println(obj.getIntro());
        obj.showMessage();

    }
}
