package src.design.AbstractFactory;

public class ConcreteFactory1 extends AbstractFactory {
    @Override
    public AbstractFactory contcreteFactory() {
        return new ConcreteFactory1();
    }

    public AbstractProductA creatProductA(){

        return  new ProductA1();
    }

    public AbstructProductB creatProductB(){

        return new ProductB1();
    }




}
