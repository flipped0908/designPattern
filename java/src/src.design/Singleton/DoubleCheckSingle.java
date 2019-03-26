package src.design.Singleton;

public class DoubleCheckSingle {


    private volatile static DoubleCheckSingle doubleCheckSingle;

    private DoubleCheckSingle() {
    }

    ;

    public static DoubleCheckSingle getInstace() {
        if (doubleCheckSingle == null) {
            synchronized (DoubleCheckSingle.class) {
                if (doubleCheckSingle == null) {
                    return new DoubleCheckSingle();
                }
            }

        }
        return doubleCheckSingle;

    }


}
