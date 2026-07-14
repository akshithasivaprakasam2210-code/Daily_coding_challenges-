import java .util.*;
public class Primenumber {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int n = a.nextInt();
        boolean isprime=true;
        if (n < 2) {
            isprime = false;
        } else {
            for (int i = 2; i < n-1; i++) {
                if (n % i == 0) {
                    isprime = false ;
                    break;
                }
            }
            if (isprime){
                System.out.print(" prime");
            }
            else{
                System.out.print("Not prime");
            }
        }
    }

}
