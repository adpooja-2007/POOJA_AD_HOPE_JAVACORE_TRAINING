import java.lang.*;
import java.util.*;
public class Numberofwords{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        str = str+" ";
        if(str.length()==0) count = 0;
        for(int i = 0; i<str.length()-1; i++){
            char x = str.charAt(i);
            char y = str.charAt(i+1);
            if(y==' ' && Character.isLetter(x))
                count++;
        }
        System.out.println(count);
    }
}