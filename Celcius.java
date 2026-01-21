import java.util.Scanner;
public class Celcius {
    public static void main(String []args){
        Scanner sca = new Scanner(System.in);
        System.out.println("Enter celcius value.");
        float cel = sca.nextFloat();
        float result = (cel * 9/5) + 32;
        System.out.printf("Fahrenheit value %.2f",result);
        sca.close();
    }
}