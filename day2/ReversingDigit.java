import java.util.Scanner;
public class ReversingDigit {
    public static void main(String[] args){
        Scanner scan=new Scanner (System.in);
        int a = scan.nextInt();
        int temp = a;
        int reverse = 0;
        int digit =0;
        while (temp>0){
            reverse=temp%10;
            digit = digit*10+reverse;
            temp=temp/10;
        }
        System.out.print(digit);
    }
}


