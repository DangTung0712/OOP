package Lesson10.Lab.Lab401;

public class Test {
    public static void main(String[] args) {
        Window window = new ListBox();
        window.DrawWindow();
        Window window1 = new Button();
        window1.DrawWindow();
        System.out.println(cong(1,2));
        System.out.println(cong(1.2f,2));
        System.out.println(cong(1,2,5));
    }

    public static int cong(int a,int b){
        return a+b;
    }
    public static float cong(float a,int b){
        return a+b;
    }
    public static float cong(int a,int b,int c){
        return a+b+c;
    }

}
