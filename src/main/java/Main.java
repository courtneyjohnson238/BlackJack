import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Player 1 enter your name: ");
        String player1 = scanner.nextLine();
        System.out.println("Player 2 enter your name: ");
        String player2 = scanner.nextLine();


        Deck deck = new Deck();
        deck.shuffle();

        Hand p1Hand = new Hand();
        Hand p2Hand = new Hand();

        p1Hand.Deal(deck.deal());
        p1Hand.Deal(deck.deal());

        p2Hand.Deal(deck.deal());
        p2Hand.Deal(deck.deal());

        System.out.println(player1 + " ") ;
        p1Hand.Print();

        System.out.println(player2 + " ") ;
        p2Hand.Print();

        int p1Score = p1Hand.getValue();
        int p2Score = p2Hand.getValue();

        if (p1Score <= 21 && (p1Score > p2Score || p2Score > 21)) {
            System.out.println(player1 + " wins!");
        } else if (p2Score <= 21 && (p2Score > p1Score || p1Score > 21)) {
            System.out.println(player2 + " wins!");
        } else {
            System.out.println("It's a tie!");
        }


    }
}
