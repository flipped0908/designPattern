package src.design.ChainFactory;

public class main {


    public static void main(String[] args) {


        OrgFactory orgFactory = OrgFactory.getInstance().letAttr1("1").letAttr3("5").letAttr2("2");

        orgFactory.actionMethod();


    }




}
