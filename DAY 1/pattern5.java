import java.util.Scanner;
public class pattern5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int val = 2*n +1;
        for(int i = 1; i<=n ; i++){
            for(int j=i; j<=val; j++){
                if(j<=n-1){
                System.out.print(" ");
            }
        }
            for(int k =1; k<(2*i); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}