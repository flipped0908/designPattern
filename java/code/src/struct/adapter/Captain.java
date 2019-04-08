package src.struct.adapter;

public class Captain {

    private RowingBoat rowingBoat;

    public Captain(){}

    public  Captain(RowingBoat rowingBoat){
        this.rowingBoat = rowingBoat;
    }

    public void row(){
        rowingBoat.row();
    }


}
