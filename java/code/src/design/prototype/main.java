package src.design.prototype;

public class main {

    public static void main(String[] args) {
        ShapeCache.loadCache();
        Shape clonedShape = (Shape) ShapeCache.getShap("1");
        System.out.println("Shape : " + clonedShape.getType());

        Shape clonedShape2 = (Shape) ShapeCache.getShap("2");
        System.out.println("Shape : " + clonedShape2.getType());

    }
}
