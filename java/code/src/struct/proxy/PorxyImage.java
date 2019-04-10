package src.struct.proxy;

public class PorxyImage implements Image {

    private RealImage realImage;
    private String  filename;

    public PorxyImage(String filename){
        this.filename = filename;
    }


    @Override
    public void display() {

        if(realImage == null){
            realImage = new RealImage(filename);
        }
        realImage.display();

    }
}
