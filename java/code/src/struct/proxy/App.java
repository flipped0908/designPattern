package src.struct.proxy;

public class App {
    public static void main(String[] args) {
        Image image = new PorxyImage("aa.png");
        image.display();
        System.out.println();
        image.display();
    }

}
