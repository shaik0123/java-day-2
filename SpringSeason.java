package day2;

import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the month");
        int month = sc.nextInt();
        System.out.println("enter the date");
        int date = sc.nextInt();
         if( ((month >=3 && date <= 20)) && ((month <= 6 && date <= 20)) ){
        //if ((( month <= 6 & date <= 20 )) && (( month >= 3 & month <= 6) && ( date <= 20))){
            System.out.println("is true");
        }
        else{
            System.out.println("is false");
        }


    }
}
