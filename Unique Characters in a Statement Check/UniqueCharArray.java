import java.util.Scanner;
public class UniqueCharArray{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the sentence:");
        String str = s.nextLine();
        str=str.replaceAll("\\s", "");
        //System.out.println(str);
        uniqueCharacters(str);
    }

    public static void uniqueCharacters(String str){
        final int no_chars = 256;
        int[] count = new int[no_chars];

        for(int i=0; i<str.length(); i++){
            if(str.charAt(0)!=' ')
            {
                count[(int)str.charAt(i)]++;
            }
        }

        System.out.println("Unique Characters:");
        for(int i=0; i<str.length(); i++){
            if(count[(int)str.charAt(i)]==1){
                System.out.println(str.charAt(i));
            }           
        }
        

    }
}