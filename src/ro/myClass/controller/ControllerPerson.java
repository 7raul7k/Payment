package ro.myClass.controller;

import ro.myClass.models.Payment;
import ro.myClass.models.Person;
import ro.myClass.models.Providers;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ControllerPerson {
    ArrayList<Payment> payments;
    public ControllerPerson(){
        this.payments = new ArrayList<>();
    this.load();
    }
    public void load(){
        try{
            File file = new File("C:\\mycode\\JavaBasics\\Mostenirea\\Payments\\src\\ro\\myClass\\resources\\payment.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()){
                String text = scanner.nextLine();

                switch (text.split(",")[0]){
                    case "person":
                        this.payments.add(new Person(text));
                        break;
                    case "providers":
                        this.payments.add(new Providers(text));
                        break;

                }

            }

        }catch (Exception e){

            e.printStackTrace();

        }

    }
    public void descriptionPayment(){
        for (Payment m : payments){
            if(m instanceof Payment){
                Person x = (Person) m;
                System.out.println(x.description());
            } else if (m instanceof Providers) {
                Providers x = (Providers) m;
                System.out.println(x.descriptionProviders());

            }

        }
    }
}
