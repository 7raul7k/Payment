package ro.myClass.models;

public class Payment {
    private int id;
    private String method;
    private String date;
    private String type;
    public Payment(int id,String payMethod,String payDate,String type){
        this.id = id;
        this.date = payDate;
        this.method = payMethod;
        this.type = type;
    }
    public Payment(String text){
        String[] proprietes = text.split(",");
        this.type = proprietes[0];
        this.date = proprietes[1];
        this.method = proprietes[2];
        this.type = proprietes[3];
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
