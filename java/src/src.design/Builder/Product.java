package src.design.Builder;

public class Product {

    public String a;

    public String b;

    public String c;

    public void setA(String s) {
        a = s;
    }

    public void setB(String s) {
        b = s;
    }

    public void setC(String s) {
        c = s;
    }

    public void show() {
        System.out.println("套餐 has "+a+"  "+ b+ " "+ c);
    }

}
