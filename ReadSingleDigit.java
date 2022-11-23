package day2;

import java.util.Scanner;

public class ReadSingleDigit {
    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        System.out.println("enter the single digit");
        int s=num.nextInt();
        if(s==1) {
            System.out.println("one");
        }
        else if(s==2) {
            System.out.println("two");
        }
        else if(s==3) {
            System.out.println("three");
        }
        else if(s==4) {
            System.out.println("four");
        }
        else if(s==5) {
            System.out.println("five");
        }
        else if(s==6) {
            System.out.println("six");
        }
        else if(s==7) {
            System.out.println("seven");
        }
        else if(s==8) {
            System.out.println("eight");
        }
        else if(s==9) {
            System.out.println("nine");
        }
        else {
            System.out.println("enter a single digit number");
        }
    }
}
