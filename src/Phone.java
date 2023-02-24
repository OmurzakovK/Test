import java.util.Arrays;
import java.util.Scanner;

public class Phone  implements PhoneInterface{
    private String brand;
    private String name;

    private int parol;
    private Contact [] contacts;



    public Phone(String brand, String name,  int parol) {

        this.brand = brand;
        this.name = name;

        this.parol = parol;

    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCname(String name) {
        this.name = name;
    }



    public void setParol(int parol) {
        this.parol = parol;
    }

    public void setContacts(Contact[] contacts) {
        this.contacts = contacts;
    }

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }



    public int getParol() {
        return parol;
    }

    public Contact[] getContacts() {
        return contacts;
    }

    Scanner sc = new Scanner(System.in);
    @Override
    public void turnOn( int parol) {
        System.out.println("Kot jaziniz:");

        int par = sc.nextInt();
        if (par == parol) {
            System.out.println("Telefon jandi:)");
        } else System.out.println("Parol katal:(");
        }

   @Override
   public void call(String fullName, int phoneNumber) {
        System.out.println(" phoneNumber berigiz");
    int nomer = sc.nextInt();;
    if (nomer==phoneNumber){
        System.out.println(fullName+"{ "+phoneNumber+"}");
    }else System.out.println(" myndai nomer jok ");
}Scanner scanner = new Scanner(System.in);
    @Override
    public void call(int phoneNumber, String fullName) {
        System.out.println("Name berigiz");

        String name = scanner.nextLine();
        if (name.equals(fullName)){
            System.out.println(phoneNumber+"{ "+fullName+"}");
            System.out.println();
        }else System.out.println("myndai cantakt jok ");
    }

    @Override
    public void searchContact(Contact[] contacts) {
        String con =scanner.nextLine();
        for (Contact d:contacts) {
            if (con.equals(d.getFullName())){
                System.out.println(d);
                break;
            }else System.out.println(" myndai cantakt jok ");
        }
    }
    @Override
    public void updateName(String fullName) {
        System.out.println("Jady Name berigiz");
        System.out.println(fullName);

}}


