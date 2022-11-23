package day2;
import java.util.Scanner;
public class VowelConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a char");
        char[] ch=sc.next().toCharArray();
        switch (ch[0]){
            case 'a' :
                System.out.println("a is vowel");
                break;
            case 'e' :
                System.out.println("e is vowel");
                break;
            case 'i' :
                System.out.println("i is vowel");
                break;
            case 'o' :
                System.out.println("o is vowel");
                break;
            case 'u' :
                break;
            default:
                System.out.println("is a consonant");
        }
    }
}

