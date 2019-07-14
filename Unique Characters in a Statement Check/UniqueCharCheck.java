import java.util.Scanner;
public class UniqueCharCheck{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the sentence:");
        String str = s.nextLine();
        str=str.replaceAll("\\s", "");
        //System.out.println(str);
        uniqueCharacters(str);
    }

    public static void uniqueCharacters(String str){
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='0' || str.charAt(i)=='1' || str.charAt(i)=='2' || str.charAt(i)=='3' || 
            str.charAt(i)=='4' || str.charAt(i)=='5' || str.charAt(i)=='6' || str.charAt(i)=='7' || 
            str.charAt(i)=='8' || str.charAt(i)=='9'){
                System.out.println("Invalid Sentence");
                System.exit(0);
            }
        }

        String temp = "";
        for(int j=0; j<str.length(); j++){
            char current = str.charAt(j);
            int count = 0;
            for(int k=0; k<str.length(); k++){
                if(str.charAt(k) == current){
                    count++;
                }
            }
            if(count == 1){
                temp = temp + current;
            }
        }

        System.out.println(temp);
        if(temp.length()==0){
            System.out.println("No unique characters");
        } else {
            System.out.println("Unique Characters:");
            for(int i=0; i<temp.length(); i++){
                System.out.println(temp.charAt(i));
            }
        }

    }
}