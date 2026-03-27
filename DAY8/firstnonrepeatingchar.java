package DAY8;
import java.util.*;
public class firstnonrepeatingchar{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase();
        char[] ch = str.toCharArray();
        int[] arr = new int[26];
        for(int i = 0; i<ch.length; i++){
            arr[ch[i]-97] +=1;
        }
        for(int i = 0; i<ch.length; i++){
            if(arr[ch[i]-97]==1){
                System.out.print(ch[i]);
                return;
            }
        }
        System.out.println("No repeating character");
    }
}