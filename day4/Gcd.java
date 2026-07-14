import java.util.Scanner;

public class Gcd {
    public static void main (String[] args){
        Scanner scan=new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        while (b!=0){
            int  c = a%b ;
            a = b;
            b=c;
        }
        System.out.print(a);
    }}


