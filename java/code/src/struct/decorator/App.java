package src.struct.decorator;

public class App {

    public static void main(String[] args) {
        Troll troll = new SimpleToll();
        troll.attack();
        troll.fellBattle();

        Troll clubbedTroll = new ClubbedTroll(troll);
        clubbedTroll.attack();
        clubbedTroll.fellBattle();
    }
}
