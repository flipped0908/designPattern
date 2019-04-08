package src.struct.adapter;

public class main {


    public static void main(String[] args) {


        Captain captain = new Captain(new FishingBoatAdapter());

        captain.row();
    }

}
