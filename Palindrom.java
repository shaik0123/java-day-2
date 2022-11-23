package day2;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number");
        int num=s.nextInt();
        //int num=12321;
        int reverse=0;
        //for(;num>0;){
        boolean flag=false;
        for(;num>0;) {
            int rem = num % 10;
            reverse = reverse * 10 + rem;
            num = num / 10;
            flag=true;

        }
        if(flag) {
            System.out.println(reverse + "is a palindrome");
        }
        else{
            System.out.println(reverse + "is not a palindrome");
        }
    }
}
