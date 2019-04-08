package src.design.Builder;

public class ConcertBuilder2 extends Builder {
    @Override
    public void biuldPartA() {
        product.setA("面包 ");
    }

    @Override
    public void biuldPartB() {
        product.setB("薯条 ");

    }

    @Override
    public void biuldPartC() {
        product.setC("可乐 ");
    }
}
