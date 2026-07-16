import java.util.*;
import java.util.*;
class   Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        String a = scan.nextLine();
        int count =0;
        for(int i = 0;i<a.length();i++){
            char ch = a.charAt(i);
            if (ch =='a'|| ch=='e'||ch =='i'||ch == 'o'||ch=='u'|| ch == 'A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                count +=1;
            }
        }
        System.out.print(count);
    }
}
