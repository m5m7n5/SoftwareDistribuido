import java.util.*;

public class Deck{
  
  //Indica la cantidad de cartas de nuestro mazo de poker
  private final int cardCount = 52;

  private ArrayList<String> cards;

  private final String[] deck = {
    "AC","2C","3C","4C","5C","6C","7C","8C","9C","10C","JC","QC","KC",
    "AD","2D","3D","4D","5D","6D","7D","8D","9D","10D","JD","QD","KD",
    "AH","2H","3H","4H","5H","6H","7H","8H","9H","10H","JH","QH","KH",
    "AS","2S","3S","4S","5S","6S","7S","8S","9S","10S","JS","QS","KS",
    };
    
  public Deck(){
    
    int i;
    cards = new ArrayList<>();
    for(i=0;i<cardCount;i++){
      cards.add(deck[i]);
    }
    Collections.shuffle(cards);
    
  }
  
  private void showDeck(){
    for (String temp : cards) {
	System.out.println(temp);
    }
  }
  
  public ArrayList<String> giveCards(int numberOfCards){
    ArrayList<String> newHand = new ArrayList<>();
    int i;
    for(i=0;i<numberOfCards;i++){
      newHand.add(cards.remove(0));
    }
    return newHand; 
  }
  
  public ArrayList<String> giveHand(){
    return this.giveCards(5);
  }
  
  public static void main(String[] args){
    Deck deck =  new Deck();
    //deck.showDeck();
    ArrayList<String> hands = deck.giveHand();
    
    for (String temp : hands) {
	System.out.println(temp);
    }
  }
  
}