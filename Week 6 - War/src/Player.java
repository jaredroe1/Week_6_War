import java.util.ArrayList;
import java.util.List;

public class Player {
    List<Card> myCards = new ArrayList<Card>();

    private List<Card> hand = new ArrayList<Card>();
    private int score;
    private String name;

    public Player() {
        score = 0;
    }

    public Player(String newName) {
        name = newName;
        score = 0;
    }


    public Card flip() {
        return hand.remove(0);
    }

    public void draw (Deck deck) {
        hand.add(deck.draw());
    }

    public void incrementScore() {
        score++;
    }

    public int getScore() {
        return score;
    }
}
