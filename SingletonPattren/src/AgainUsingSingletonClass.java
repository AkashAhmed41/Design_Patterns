public class AgainUsingSingletonClass {
    public static void main(String[] args) {
        SingletonClass obj = SingletonClass.getInstance();

        System.out.println(obj.getIntro());
        obj.showMessage();
        obj.setIntro("Now I'm a mid level coder.");
        System.out.println(obj.getIntro());
    }
}
