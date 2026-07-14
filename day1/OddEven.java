import java.util.*;
public class OddEven{
    public static void main(String[] args ){
        Scanner scan=new Scanner (System.in);
        int a = scan.nextInt();
        if (a %2==0){
            System.out.println("Even");
        }
        else{
            System.out.print("Odd");
        }
    }
}
