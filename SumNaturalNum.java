package day2;

import java.util.Scanner;

public class SumNaturalNum {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("enter the num");
        int N=n.nextInt();
        int i=1;
        int sum=0;
        while(i<=N)
        {
           //sum=sum+ i;
            System.out.print(i+"+");
            //System.out.println(sum);
            i++;
        }
    }
}



