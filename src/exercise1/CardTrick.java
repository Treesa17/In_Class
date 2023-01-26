package exercise1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks
 * the user to pick a card. It then searches the array of cards for the match to
 * the user's card. To be used as starting code in Exercise
 *
 * @author Treesa Saju
 * @author Treesa Saju Jan 25, 2022
 */
public class CardTrick {

    public static void main(String[] args) {

        Card[] hand = new Card[7];
        Scanner k = new Scanner(System.in);
        Random r = new Random();
        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue((1 + r.nextInt(13)));
            card.setSuit(Card.SUITS[r.nextInt(4)]);

            hand[i] = card;

        }
        Card one = new Card();
        System.out.println("Enter card value");
        int value = k.nextInt();
        System.out.println("Enter Suit:");
        String suit = k.next();
        one.setValue(value);
        one.setSuit(suit);

        boolean found = false;
        System.out.println(one);
        for (int i = 0; i < hand.length; i++) {
            if (hand[i].getValue() == one.getValue() && hand[i].getSuit().equalsIgnoreCase(one.getSuit())) {

                found = true;
                break;
            }
        }
        if (found) {
            CardTrick call = new CardTrick();
            call.printInfo();

        } else {
            System.out.println("Card is not found in hand");

        }

    }

    /**
     * A simple method to print out personal information. Follow the
     * instructions to replace this information with your own.
     *
     * @author Treesa Saju Jan 25 2022
     */
    private static void printInfo() {

        System.out.println("Congratulations, you guessed right!");
        System.out.println();

        System.out.println("My name is Treesa saju, but you can call me Tree");
        System.out.println();

        System.out.println("My career ambitions:");
        System.out.println("-- Be an professional software enginner ");
        System.out.println("-- Have a good family");
         System.out.println("--Owning a bussiness");
        System.out.println();

        System.out.println("My hobbies:");
        System.out.println("-- Gardening");
        System.out.println("-- Cooking");
        System.out.println("-- Music/Watching TV");
        System.out.println("--Badminton ");

    }

}
