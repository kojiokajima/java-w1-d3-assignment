import java.util.Scanner;

public class problem1 {

    public static void main(String[] args) {

        int tempMax, max, num1, num2;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter 3 numbers: ");

        max = input.nextInt();
        num1 = input.nextInt();
        if(max < num1) {
            tempMax = max;
            max = num1;
            num1 = tempMax;
        }
        num2 = input.nextInt();
        if(max < num2) {
            tempMax = max;
            max = num2;
            num2 = tempMax;
        }

        if(max < num1 + num2) {
            System.out.println("The perimeter is " + (max + num1 + num2));
        } else {
            System.out.println("The input is invalid");
        }

    }
}