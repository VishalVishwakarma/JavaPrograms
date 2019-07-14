import java.util.*;
import java.util.Scanner;
public class Semester{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of semesters:");
        int n = s.nextInt();
        
        //defined a MAP array list that has the KEY as the semester name
        //and its map value is --> an array of subject numbers that hold marks
        Map<String, int[]> semesters = new HashMap<>();
        
        //after getting number of semesters we initiate a for loop
        for (int i = 0; i<n; i++) {
            
            //for every sem we get the number of subjects
            System.out.println("Enter number of subjects in semester " + (i+1) + ":");
            //created a temp variable that can hold the number of subjects
            int sub_no = s.nextInt();
            //created a new temp array that will now hold the marks of each subject for that semester
            int[] semsub = new int[sub_no];
            //for loop started to get the marks of each subject
            for(int j = 0; j<sub_no; j++){
                System.out.println("Enter marks for  subject " + (j+1) + ":");
                int marks = s.nextInt();
                //for each subject marks is stored in the temp array SEMSUB created above
                semsub[j] = marks;
            }

            /*now finally we have the marks of all subjects for sem 'i', so now we just insert this data
            in MAP ARRAY with key name as semester0, semester1, and so on*/
            semesters.put("semester" + i, semsub);
            
        }   
        

        //this will print all the semester key names
        System.out.println(semesters.keySet());

        //just a trial to print the marks of ONLY FIRST subject of each semester.
        for (int i = 0; i<n; i++) {
            System.out.println(semesters.get("semester"+i)[0]); 
        }


    }
}