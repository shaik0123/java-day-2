package day2;
public class ArithmeticOperation {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int value1 = a + b * c;
        int value2 = c + a / b;
        int value3 = a % b + c;
        int value4 = a * b + c;
        if (value1 > value2 && value1 > value3 && value1 > value4) {
            System.out.println(value1 + "max value1");
        }
        else if (value2 > value1 && value2 > value3 && value2 > value4) {
            System.out.println(value2 +"max value2");
        }
        else if(value3 > value1 && value3 > value2 && value3 > value4) {
            System.out.println(value3 + "max value3");
        }
        else {
            System.out.println(value4 + "max value4");
        }
        if(value1 < value2 && value1 < value3 && value1 < value4){
            System.out.println(value1 + "min value1");
        }
        else if (value2 < value1 && value2 < value3 && value2 < value4) {
            System.out.println(value2 + "min value2");
        }
        else if (value3 < value1 && value3 < value2 && value3 < value4) {
            System.out.println(value3 + "min value3");
        }
        else{
            System.out.println(value4 + "min value4");

        }
    }
}
