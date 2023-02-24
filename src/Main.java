import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Contact cantact1=new Contact(709427406,"Keldibek");
        Contact [] contacts={cantact1};
       Phone phone=new Phone("POCO","Poco F3",1234);
       phone.turnOn(phone.getParol());
       phone.call(cantact1.getFullName(), cantact1.getPhoneNumber());
       phone.call(cantact1.getPhoneNumber(),cantact1.getFullName());
        phone.searchContact(contacts);
        phone.updateName(scanner.next());
    }
}