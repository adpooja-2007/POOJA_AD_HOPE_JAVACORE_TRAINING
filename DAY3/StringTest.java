import java.util.*;
class StringTest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] parts = str.split(" ");
        int len = parts.length;
        System.out.println("length: "+len);
        sc.close();
    }
}