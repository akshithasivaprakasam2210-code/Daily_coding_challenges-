import java .util.Scanner;
public class Perfectnumber {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int sum=0;
        for (int i =1;i<a;i++){
            if (i%2==0){
                sum+=i;
            }
        }
        if (sum==a){
            System.out.println("True");
        }
        else{
            System.out.print("False");
        }
    }
}