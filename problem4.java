import java.util.Random;
import java.util.Scanner;

public class problem4 {

    public static void main(String[] args) {

        int compNum = (int)(Math.random() * 3);

        Scanner input = new Scanner(System.in);

        System.out.print("scissor(0), rock(1), paper(2): ");
        int userNum = input.nextInt();

        switch(compNum) {
            case 0:
                switch(userNum) {
                    case 0: System.out.println("The computer is scissor. You are scissor too. It is a draw");
                    break;
                    case 1: System.out.println("The computer is scissor. You are rock. You won");
                    break;
                    case 2: System.out.println("The computer is scissor. You are paper. You lost");
                    break;
                }
            break;
            case 1:
                switch(userNum) {
                    case 0: System.out.println("The computer is rock. You are scissor. You lost");
                    break;
                    case 1: System.out.println("The computer is rock. You are rock too. It is a draw");
                    break;
                    case 2: System.out.println("The computer is rock. You are paper. You won");
                    break;
                }
            break;
            case 2:
                switch(userNum) {
                    case 0: System.out.println("The computer is paper. You are scissor. won");
                    break;
                    case 1: System.out.println("The computer is paper. You are rock. You lost");
                    break;
                    case 2: System.out.println("The computer is paper. You are paper too. It is a draw");
                    break;
                }
            break;
        }

    }
}