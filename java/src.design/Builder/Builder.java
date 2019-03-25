package src.design.Builder;

public abstract class Builder {

    protected Product product;

    public abstract void biuldPartA();

    public abstract void biuldPartB();

    public abstract void biuldPartC();

    public Builder(){
        product = new Product();
    }


}
