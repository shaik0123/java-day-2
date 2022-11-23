package day2;

import java.util.Scanner;

public class DisplayUnits {
    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        System.out.println("enter the number");
        int s=num.nextInt();
        if(s==1) {
            System.out.println("units");
        }
        else if(s==10) {
            System.out.println("tens");
        }
        else if(s==100) {
            System.out.println("hundreds");
        }
        else if(s==1000) {
            System.out.println("thousands");
        }
        else {
            System.out.println("enter the correct number");
        }
    }
}
