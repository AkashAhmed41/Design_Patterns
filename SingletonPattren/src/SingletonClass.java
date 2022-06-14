public class SingletonClass {
    private static SingletonClass instance = new SingletonClass();
    private String intro = "This is my intro to programming...";

    private SingletonClass(){}

    public static SingletonClass getInstance() {
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World, I'm a newbie.");
    }

    public String getIntro(){
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }
}
