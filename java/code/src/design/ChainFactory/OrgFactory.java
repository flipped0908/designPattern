package src.design.ChainFactory;

public class OrgFactory {

    private String attr1;

    private String attr2;

    private String attr3;

    public String getAttr1() {
        return attr1;
    }

    public void setAttr1(String attr1) {
        this.attr1 = attr1;
    }

    public String getAttr2() {
        return attr2;
    }

    public void setAttr2(String attr2) {
        this.attr2 = attr2;
    }

    public String getAttr3() {
        return attr3;
    }

    public void setAttr3(String attr3) {
        this.attr3 = attr3;
    }


    private static final  OrgFactory instance = new OrgFactory();

    private OrgFactory(){

    }


    public static OrgFactory getInstance(){
        return instance;
    }

    public  OrgFactory letAttr1(String attr1){
        instance.setAttr1(attr1);
        return instance;
    }

    public  OrgFactory letAttr2(String attr1){
        instance.setAttr2(attr1);
        return instance;
    }


    public  OrgFactory letAttr3(String attr3){
        instance.setAttr3(attr3);
        return instance;
    }



    public void actionMethod(){

        if("1".equals(attr1)){
            System.out.println("attr1 is 1");
        }


        if("2".equals(attr2)){
            System.out.println("attr2 is 2");
        }



    }



}
