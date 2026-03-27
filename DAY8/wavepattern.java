package DAY8;
import java.util.*;
class wavepattern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder str = new StringBuilder();
        String s2 ="";
        char[] ch = s.toCharArray();
        for(int i = 0; i<ch.length; i++){
            if(i%2==0)
                str.append(ch[i]);
            else
                s2=s2+ ch[i];
        }
        String res = str.toString()+s2;
        System.out.print(res);
    }
}