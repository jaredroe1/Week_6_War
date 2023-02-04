public class App {

    public static void main(String[] args) {
        Deck deck = new Deck();
        Player player1 = new Player("P1");
        Player player2 = new Player("P2");
        Player roundDraw = new Player("Draw");
        deck.shuffle();


        for (int i = 0; i < 52; i++) {
            if (i % 2 == 0) {
                player1.draw(deck);
            } else {
                player2.draw(deck);
            }
        }
        for (int i = 0; i < 26; i++) {
            System.out.println("***** P1 *****");
            Card player1Card = player1.flip();
            player1Card.yourCard();

            System.out.println("----- P2 -----");
            Card player2Card = player2.flip();
            player2Card.yourCard();
            System.out.println("\n");
            if (player1Card.getValue() > player2Card.getValue()) {
                player1.incrementScore();
            } else if (player1Card.getValue() < player2Card.getValue()) {
                player2.incrementScore();
            } else if (player1Card.getValue() == player2Card.getValue()) {
                roundDraw.incrementScore();
            }
        }

        System.out.printf("P1 game score = %d\n", player1.getScore());
        System.out.printf("P2 game score = %d\n", player2.getScore());
        System.out.printf("Rounds ending in a draw = %d\n", roundDraw.getScore());
        if (player1.getScore() > player2.getScore()) {
            System.out.println("P1 wins!");
        } else if (player1.getScore() < player2.getScore()) {
            System.out.println("P2 wins!");
        } else {
            System.out.println("The game is a TIE!!");
        }

    }
}
