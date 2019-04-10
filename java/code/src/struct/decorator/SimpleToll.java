package src.struct.decorator;

public class SimpleToll implements  Troll {
    @Override
    public void attack() {
        System.out.println("the troll tries to grab you ");
    }

    @Override
    public int  getAttackPower() {
    return 10;
    }

    @Override
    public void fellBattle() {
        System.out.println("The troll shrieks in horror and runs away");
    }
}
