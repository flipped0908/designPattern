package src.design.Builder;

public class Direct {

    private Builder builder;

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }


    public Product build() {

        builder.biuldPartA();
        builder.biuldPartB();
        builder.biuldPartC();

        return builder.product;

    }

}
