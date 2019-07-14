import java.io.*;
import java.util.*;

public class EqualMethodCheck{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the name");
        String name = s.next();
        System.out.println("Enter the panno:");
        String panno = s.next();
        System.out.println("Enter the emailID");
        String emailid = s.next();
        System.out.println("Enter the salary");
        int salary = s.nextInt();
        Customer c1 = new Customer(name, panno, emailid, salary);
        System.out.println("Enter the name");
        name = s.next();
        System.out.println("Enter the panno:");
        panno = s.next();
        System.out.println("Enter the emailID");
        emailid = s.next();
        System.out.println("Enter the salary");
        salary = s.nextInt();
        Customer c2 = new Customer(name, panno, emailid, salary);
        boolean b = c2.equals(c1);
        if(b==true)
        System.out.println("Both are equal");
        else
        System.out.println("Both are not equal");

    }

    

}