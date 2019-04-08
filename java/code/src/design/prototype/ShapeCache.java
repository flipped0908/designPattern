package src.design.prototype;

import java.util.Hashtable;

public class ShapeCache {

    private  static Hashtable<String,Shape> cacheMap = new Hashtable<>();

    public static Shape getShap(String id){
        Shape cacheShape = cacheMap.get(id);
        return (Shape) cacheShape.clone();
    }


    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        cacheMap.put(circle.getId(),circle);

        Squre square = new Squre();
        square.setId("2");
        cacheMap.put(square.getId(),square);

    }



}
