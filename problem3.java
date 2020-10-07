import java.util.Random;

public class problem3 {

    public static void main(String[] args) {

        int num = (int)(Math.random() * 52) + 1;
        
        switch(num % 4) {
            case 0:
                switch(num % 13) {
                    case 0: System.out.println("The card you picked is Clubs of King");
                    break;
                    case 1: System.out.println("The card you picked is Clubs of Ace");
                    break;
                    case 2: System.out.println("The card you picked is Clubs of 2");
                    break;
                    case 3: System.out.println("The card you picked is Clubs of 3");
                    break;
                    case 4: System.out.println("The card you picked is Clubs of 4");
                    break;
                    case 5: System.out.println("The card you picked is Clubs of 5");
                    break;
                    case 6: System.out.println("The card you picked is Clubs of 6");
                    break;
                    case 7: System.out.println("The card you picked is Clubs of 7");
                    break;
                    case 8: System.out.println("The card you picked is Clubs of 8");
                    break;
                    case 9: System.out.println("The card you picked is Clubs of 9");
                    break;
                    case 10: System.out.println("The card you picked is Clubs of 10");
                    break;
                    case 11: System.out.println("The card you picked is Clubs of Jack");
                    break;
                    case 12: System.out.println("The card you picked is Clubs of Queen");
                    break;
                }
            break;
            case 1:
                switch(num % 13) {
                    case 0: System.out.println("The card you picked is Diamonds of King");
                    break;
                    case 1: System.out.println("The card you picked is Diamonds of Ace");
                    break;
                    case 2: System.out.println("The card you picked is Diamonds of 2");
                    break;
                    case 3: System.out.println("The card you picked is Diamonds of 3");
                    break;
                    case 4: System.out.println("The card you picked is Diamonds of 4");
                    break;
                    case 5: System.out.println("The card you picked is Diamonds of 5");
                    break;
                    case 6: System.out.println("The card you picked is Diamonds of 6");
                    break;
                    case 7: System.out.println("The card you picked is Diamonds of 7");
                    break;
                    case 8: System.out.println("The card you picked is Diamonds of 8");
                    break;
                    case 9: System.out.println("The card you picked is Diamonds of 9");
                    break;
                    case 10: System.out.println("The card you picked is Diamonds of 10");
                    break;
                    case 11: System.out.println("The card you picked is Diamonds of Jack");
                    break;
                    case 12: System.out.println("The card you picked is Diamonds of Queen");
                    break;
                }
            break;
            case 2:
                switch(num % 13) {
                    case 0: System.out.println("The card you picked is Hearts of King");
                    break;
                    case 1: System.out.println("The card you picked is Hearts of Ace");
                    break;
                    case 2: System.out.println("The card you picked is Hearts of 2");
                    break;
                    case 3: System.out.println("The card you picked is Hearts of 3");
                    break;
                    case 4: System.out.println("The card you picked is Hearts of 4");
                    break;
                    case 5: System.out.println("The card you picked is Hearts of 5");
                    break;
                    case 6: System.out.println("The card you picked is Hearts of 6");
                    break;
                    case 7: System.out.println("The card you picked is Hearts of 7");
                    break;
                    case 8: System.out.println("The card you picked is Hearts of 8");
                    break;
                    case 9: System.out.println("The card you picked is Hearts of 9");
                    break;
                    case 10: System.out.println("The card you picked is Hearts of 10");
                    break;
                    case 11: System.out.println("The card you picked is Hearts of Jack");
                    break;
                    case 12: System.out.println("The card you picked is Hearts of Queen");
                    break;
                }
            break;
            case 3:
                switch(num % 13) {
                    case 0: System.out.println("The card you picked is Spades of King");
                    break;
                    case 1: System.out.println("The card you picked is Spades of Ace");
                    break;
                    case 2: System.out.println("The card you picked is Spades of 2");
                    break;
                    case 3: System.out.println("The card you picked is Spades of 3");
                    break;
                    case 4: System.out.println("The card you picked is Spades of 4");
                    break;
                    case 5: System.out.println("The card you picked is Spades of 5");
                    break;
                    case 6: System.out.println("The card you picked is Spades of 6");
                    break;
                    case 7: System.out.println("The card you picked is Spades of 7");
                    break;
                    case 8: System.out.println("The card you picked is Spades of 8");
                    break;
                    case 9: System.out.println("The card you picked is Spades of 9");
                    break;
                    case 10: System.out.println("The card you picked is Spades of 10");
                    break;
                    case 11: System.out.println("The card you picked is Spades of Jack");
                    break;
                    case 12: System.out.println("The card you picked is Spades of Queen");
                    break;
                }
            break;
        }


    }
}