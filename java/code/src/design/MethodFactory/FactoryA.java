package src.design.MethodFactory;

import java.text.Annotation;

public class FactoryA extends AbstructFactory {
    @Override
    public AbstractProduct fmethod() {
        return new Product();
    }




}
