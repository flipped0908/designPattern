package src.design.MethodFactory;

        import src.design.AbstractFactory.AbstractFactory;

public class Product extends AbstractProduct {


    @Override
    public void use(AbstractFactory abstractFactory) {
        System.out.println(abstractFactory.getClass().getName() + " use product");
    }
}
