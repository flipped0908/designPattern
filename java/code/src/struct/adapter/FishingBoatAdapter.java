package src.struct.adapter;

public class FishingBoatAdapter implements RowingBoat{

    private FishingBoot fishingBoot;

    public FishingBoatAdapter(){
        this.fishingBoot = new FishingBoot();
    }



    @Override
    public void row() {

        fishingBoot.sail();

    }
}
