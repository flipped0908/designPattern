package src.design.Singleton;

public class InnerSingle {

    private static class Inner {
        private static final InnerSingle instance = new InnerSingle();

    }

    private InnerSingle() {

    }

    public static final InnerSingle getInstance() {
        return Inner.instance;
    }


}
