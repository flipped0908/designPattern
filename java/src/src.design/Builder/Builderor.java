package Builder;

public abstract class Builderor {


    public Producte product;

    public abstract void biuldPartA();

    public abstract void biuldPartB();

    public abstract void biuldPartC();

    public Builderor(){
        product = new Producte();
    }
}
