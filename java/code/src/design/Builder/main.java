package src.design.Builder;

public class main {

    public static void main(String[] args) {
        Builder builder = new ConcertBuilder2();
        show(builder);
        builder = new ConcreteBuilder();
        show(builder);
    }

    public static void show(Builder builder) {

        Direct direct = new Direct();
        direct.setBuilder(builder);
        Product p = direct.build();
        p.show();

    }


}
