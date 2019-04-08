package src.design.AbstractFactory;

public class ConcreteFactory2 extends AbstractFactory {
    @Override
    public AbstractFactory contcreteFactory() {
        return new ConcreteFactory2();
    }


    public AbstractProductA creatProductA(){

        return  new ProductA2();
    }

    public AbstructProductB creatProductB(){

        return new ProductB2();
    }


}
