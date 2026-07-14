import java.util.Scanner;
public class SumofDigits {
    public static void main(String[] args){
        int sum=0;
        Scanner scan=new Scanner (System.in);
        int a = scan.nextInt();
        for(int i=0;i<=a;i++){
            sum+=i;
        }
        System.out.println( sum);


    }
}
