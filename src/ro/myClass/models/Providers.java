package ro.myClass.models;

public class Providers extends Payment{
    private String name;
    private double commision;
    private int totalAmount;

    public Providers(int id,String payMethod,String payDate,String type,String name,double commision,int totalAmount){
        super(id, payMethod, payDate, type);
        this.name = name;
        this.commision = commision;
        this.totalAmount = totalAmount;
    }
    public Providers(String text){
        super(text);
        String[] proprietes = text.split(",");
        this.name = proprietes[4];
        this.commision = Double.parseDouble(proprietes[5]);
        this.totalAmount = Integer.parseInt(proprietes[6]);
    }
    public String descriptionProviders(){
        String text ="";
        text += "ID:" + super.getId();
        text += "\n Method: " + super.getMethod();
        text += "\n Date: " + super.getDate();
        text += "\n Name : " + name;
        text += "\n Commision: " + commision;
        text += "\n Total amount: " + totalAmount;
        text += "\n======================================================\n";
        return text;

    }

}
