package day2;

public class ReverseNaturalNum {
    public static void main(String[] args) {
        int reverse=0;
        int num=123;
        for(;num!=0;){
            int remainder= num%10;
            reverse= reverse * 10 + remainder;
            num=num/10;

        }
        System.out.println(reverse);

    }
}
