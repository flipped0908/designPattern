package src.design.MethodFactory;



public class FactoryB extends AbstructFactory {


    @Override
    public AbstractProduct fmethod() {
        return new Product();
    }
}
