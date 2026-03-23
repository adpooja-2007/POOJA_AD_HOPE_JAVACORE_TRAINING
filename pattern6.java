import java.util.Scanner;
public class pattern6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int val = 2*n +1;
        for(int i = n; i>=1 ; i--){
            for(int j=0; j<n-i; j++){
                System.out.print(" ");
        }
            for(int k =1; k<(2*i); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}