package ro.myClass.models;

public class Person extends Payment {
private String fName;
private String lName;
private int age;
private String country;

public Person(int id,String payMethod,String payDate,String type,String fName,String lName,int age,String country){
    super(id, payMethod, payDate, type);
    this.fName = fName;
    this.lName = lName;
    this.age = age;
    this.country = country;
}
public Person(String text){
    super(text);
    String[] proprietes = text.split(",");
    this.fName = proprietes[4];
    this.lName = proprietes[5];
    this.age= Integer.parseInt(proprietes[6]);
    this.country = proprietes[7];
}
public String description(){
    String text = "";
    text += "ID: " + super.getId();
    text += "\n Method: " + super.getMethod();
    text += "\n Date: " + super.getDate();
    text += "\n First Name: " + fName;
    text += "\n Last name: " +  lName;
    text += "\n Age: " + age;
    text += "\n Country: " + country;
    text += "\n=========================================================================\n";
    return text;


}

}
