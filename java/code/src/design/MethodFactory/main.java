package src.design.MethodFactory;

public class main {
    public static void main(String[] args) {
        AbstructFactory A = new FactoryA();

        AbstractProduct pa = A.fmethod();

        AbstructFactory b = new FactoryB();

        AbstractProduct pb = b.fmethod();

        pa.use(A);

        pb.use(b);
    }
}
