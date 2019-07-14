import java.util.*;

public class Numerology{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = s.nextLine();
        int count = 0;
        char[][] a = new char[2][26];

        a[0][0] = 'A';
        a[0][1] = 'B';
        a[0][2] = 'C';
        a[1][0] = 1;
        a[1][1] = 2;
        a[1][2] = 4;

        for(int i=0; i<name.length(); i++){
            for(int j=0; j<3; j++){
                if(name.charAt(i)==a[0][j]){
                    count += a[1][j];
                }
            }
        }

        System.out.println(count);

    }
}