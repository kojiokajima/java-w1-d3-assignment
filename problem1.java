import java.util.Scanner;

public class problem1 {

    public static void main(String[] args) {

        int max, number1, number2;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter 3 numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        max = Math.max(num1, Math.max(num2, num3));

        if (max == num1){
            number1 = num2;
            number2 = num3;
        } else if (max == num2){
            number1 = num1;
            number2 = num3;
        } else {
            number1 = num1;
            number2 = num2;
        }

        if(max < number1 + number2) {
            System.out.println("The perimeter is " + (max + number1 + number2));
        } else {
            System.out.println("The input is invalid");
        }

    }
}