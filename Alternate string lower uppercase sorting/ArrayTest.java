import java.util.*;

public class ArrayTest{
    public static void main(String args[]){
        int[] a = new int[10];
        for(int i=0; i<10; i++){
            a[i] = i;
            System.out.println(i + " = " +a[i]);
        }

        System.out.println("3++" + a[3]++);
        System.out.println("3 new value " + a[3]);
        // char b,c;
        // b='b';
        // c='c';
        // System.out.println((int)c-(int)b);

        // String s = "Vishal";
        // char[] sc = s.toCharArray();
        // System.out.println(sc[2]);
    }
}