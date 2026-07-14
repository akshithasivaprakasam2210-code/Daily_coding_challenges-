package com.akshitha.dailycodingchallenges.day4;
import java.util.*;
public class Lcm {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int ptd= a*b;
        int temp =a;
        while (b!=0){
            int  c = a % b ;
            temp = b;
            b=c;
        }
        int lcm = ptd/temp;
        System.out.print(lcm);
    }
}
