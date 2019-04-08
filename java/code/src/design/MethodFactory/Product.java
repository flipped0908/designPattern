package src.design.MethodFactory;


public class Product extends AbstractProduct {


    @Override
    public void use(AbstructFactory abstractFactory) {
        System.out.println(abstractFactory.getClass().getName() + " use product");
    }
}
