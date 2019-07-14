import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        ArrayList<Passenger> pp = new ArrayList<Passenger>();
        System.out.println("Enter the number of passengers:");
        int n = s.nextInt();
        for(int i=1; i<=n; i++){
            System.out.println("Passenger" + i);
            System.out.println("Enter the ticket ID:");
            int ticketid = s.nextInt();
            System.out.println("Enter the name:");
            String name = s.next();
            System.out.println("Enter gender:");
            String gender = s.next();
            System.out.println("Enter the address:");
            String address = s.next();
            Passenger p = new Passenger(ticketid, name, gender, address);
            pp.add(p);
        }
        System.out.println(pp);
    }
}