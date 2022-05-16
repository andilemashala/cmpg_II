import java.util.Random;
import java.util.Arrays;

class Card{
    public Card(int value, String suit){
        this.value = value;
        this.suit = suit;
    }
    String suit;
    int value;
}
abstract class GameCard{
    Card[] deck = new Card[52];
    int number_of_card_dealt;

    public GameCard(){
        deck = new Card[]{
                new Card(1, "diamond"),
                new Card(1, "Spade"),
                new Card(1, "heart"),
                new Card(1, "tree"),
                new Card(2, "diamond"),
                new Card(2, "Spade"),
                new Card(2, "heart"),
                new Card(2, "tree"),
                new Card(3, "diamond"),
                new Card(3, "Spade"),
                new Card(3, "heart"),
                new Card(3, "tree"),
                new Card(4, "diamond"),
                new Card(4, "Spade"),
                new Card(4, "heart"),
                new Card(4, "tree"),
                new Card(5, "diamond"),
                new Card(5, "Spade"),
                new Card(5, "heart"),
                new Card(5, "tree"),
                new Card(6, "diamond"),
                new Card(6, "Spade"),
                new Card(6, "heart"),
                new Card(6, "tree"),
                new Card(7, "diamond"),
                new Card(7, "Spade"),
                new Card(7, "heart"),
                new Card(7, "tree"),
                new Card(8, "diamond"),
                new Card(8, "Spade"),
                new Card(8, "heart"),
                new Card(8, "tree"),
                new Card(9, "diamond"),
                new Card(9, "Spade"),
                new Card(9, "heart"),
                new Card(9, "tree"),
                new Card(10, "diamond"),
                new Card(10, "Spade"),
                new Card(10, "heart"),
                new Card(10, "tree"),
                new Card(11, "diamond"),
                new Card(11, "Spade"),
                new Card(11, "heart"),
                new Card(11, "tree"),
                new Card(12, "diamond"),
                new Card(12, "Spade"),
                new Card(12, "heart"),
                new Card(12, "tree"),
                new Card(13, "diamond"),
                new Card(13, "Spade"),
                new Card(13, "heart"),
                new Card(13, "tree"),
        };
    }

    public void shuffle(){
        Random r = new Random();
        for(int i = 0; i < deck.length - 1; i++){
            int j = r.nextInt(i+1);
            Card temp = deck[j];
            deck[j] = deck[i];
            deck[i] = temp;
        }
    }

    abstract void displayDescription();
    abstract void deal();
}

class Poker extends GameCard {
    Card[] cards_dealt_poker;
    public Poker(int num_of_cards){
        number_of_card_dealt = num_of_cards;
    }
    @Override
    void displayDescription() {
        //description about poker
    }

    @Override
    void deal() {
        for(int i = 0; i < number_of_card_dealt; i++){
            cards_dealt_poker[i] = deck[i];
        }
    }

    public void displayCards(){
        for(int i = 0; i < number_of_card_dealt; i++){
            System.out.println(cards_dealt_poker[i].value + " "+ cards_dealt_poker[i].suit);
        }
    }
}
class Bridge extends GameCard{
    Card[] cards_dealt_bridge;
    public Bridge(int num_of_cards){
        number_of_card_dealt = num_of_cards;
       cards_dealt_bridge = new Card[number_of_card_dealt];
    }
    @Override
    void displayDescription() {
        //print description about Bridge
    }

    @Override
    void deal() {
        for(int i = 0; i < number_of_card_dealt; i++){
            cards_dealt_bridge[i] = deck[i];
        }
    }

    public void displayCards(){
        for(int i = 0; i < number_of_card_dealt; i++){
            System.out.println(cards_dealt_bridge[i].value + " "+ cards_dealt_bridge[i].suit);
        }
    }
}

public class Main{
    public static void main(String[] args) {
        Bridge b1 = new Bridge(5);
        b1.shuffle();
        b1.deal();
        b1.displayCards();
    }
}

