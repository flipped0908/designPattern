package src.design.AbstractFactory;

public class main {

    public static void main(String[] args) {


        AbstractFactory fa = new ConcreteFactory1();

        AbstractProductA abstractProductA =  ((ConcreteFactory1) fa).creatProductA();

        abstractProductA.use();



    }
}
