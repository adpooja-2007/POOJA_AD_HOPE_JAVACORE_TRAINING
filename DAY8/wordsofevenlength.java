package DAY8;
import java.util.*;
public class wordsofevenlength{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        String str = sc.nextLine();
        StringBuilder s = new StringBuilder();
        char[] ch = str.toCharArray();
        String s1 = "";
        for(int i= 0; i<ch.length; i++){
            if(!(ch[i]==' ')){
                s1=s1+ch[i];
            }
            if(ch[i]==' '|| i==ch.length-1){
                if((s1.length())%2==0 && s1.length()>0){
                    s.append(s1).append(" ");
                }
                            s1 = "";
            }
        }
        System.out.print(s.toString());
    }
}
