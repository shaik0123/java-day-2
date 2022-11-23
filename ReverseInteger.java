package day2;

public class ReverseInteger {
    public static void main(String[] args) {
//        Scanner s=new Scanner(System.in);
//        System.out.println("enter the value");
//        int S=s.nextInt();
//        System.out.println(S);
        int S=123,reverse=0;
        while(S!=0){
            int remainder= S%10;
            reverse= reverse * 10 + remainder;
           S=S/10;

        }
        System.out.println(reverse);

    }
}
