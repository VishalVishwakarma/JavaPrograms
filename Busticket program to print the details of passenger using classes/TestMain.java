import java.util.Scanner;
public class TestMain{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Person p = new Person();
        System.out.println("Enter the passenger name:");
        String name = s.nextLine();
        System.out.println("Enter the gender (M or F/m or f):");
        char gender = s.nextLine().charAt(0);
        System.out.println("Enter the age:");
        int age = s.nextInt();

        p.setName(name);
        p.setGender(gender);
        p.setAge(age);
        
        BusTicket b = new BusTicket();
        b = getTicketDetails(p);

        System.out.println("Ticket no: " + b.getTicketNo());
        System.out.println("Passenger Name: " + p.getName());
        System.out.println("Price of ticket: " + b.getTicketPrice());
        System.out.println("Total Amount: " + b.getTotalAmount());
    }

    public static BusTicket getTicketDetails(Person person){
        Scanner s1 = new Scanner(System.in);
        BusTicket b1 = new BusTicket();
        b1.setPerson(person);
        System.out.println("Enter the ticket number: ");
        int ticketNo = s1.nextInt();
        b1.setTicketNo(ticketNo);
        System.out.println("Enter the ticket price: ");
        float ticketPrice = s1.nextFloat();
        b1.setTicketPrice(ticketPrice);
        return b1;
    }
}