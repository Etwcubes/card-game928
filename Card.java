public class Card {

    //suit
    public final static int CLUBS = 0;
    public final static int DIAMONDS = 1;
    public final static int HEARTS = 2;
    public final static int SPADES = 3;
    public final static int JOKER = 4;

    //values
    public final static int ACE = 1;
    public final static int JACK = 11;
    public final static int QUEEN = 12;
    public final static int KING = 13;

    //this contains one of the constants SPADES......
    private final int suit;

    //this containts the value of card
    private final int value;

    //constructor
    public Card(){
        suit = HEARTS;
        value = QUEEN;
    }

    //creates a card with a specified suit and value
    //TODO: "Suit" Paramaeter must be a number of 0,1,2,3,4
    //TODO: "Value" Parameter must be a number from 1 to 13
    //hint: use if statements
    public Card(int Value, int Suit){
        if(Suit != SPADES && Suit!=HEARTS&&Suit!=DIAMONDS&&Suit!=CLUBS){
            throw new IllegalArgumentException("Cannot have this type of suit");
        }
        value = Value;
        suit = Suit;
    }

    //returns the suit of this card
    public int getSuit(){
        return suit;
    }

    //returns value of this card
    public int getValue(){
        return value;
    }

    //TODO: return the string version of the cards "Suit"
    //hint: use switch case
    public String getSuitString(){
        switch(suit){
            case 0:
                return "Spades";
            case 1:
                return "Hearts";
            case 2:
                return "Diamonds";
            case 3:
                return "Clubs";
        }
        return null;
    }

    //TODO: return the string version of the cards "Value"
    //hint: use switch case
    //example: card1.suit = 2, card1.value = 12
    //card1.getValueString -----> returns "Queen"
    //card1.getSuitString ---> returns "DIAMONDS"
    public String getValueString(){
        switch(value){
            case 1:
                return "Ace";

            case 2:
                return "Two";

            case 3:
                return "Three";

            case 4:
                return "Four";

            case 5:
                return "Five";

            case 6:
                return "Six";

            case 7:
                return "Seven";

            case 8:
                return "Eight";

            case 9:
                return "Nine";

            case 10:
                return "Ten";

            case 11:
                return "Eleven";

            case 12:
                return "Twelve";

            case 13:
                return "Thirteen";

        }
        return "";
    }

    //TODO:  this function will use getValueString() and getSuitString()
    //example; exampleCard.suit = 0, value = 13
    //exampleCard.toString() -----> "King of Spades"
    //basically add in the "of"

    public String toString(){

        return getValueString() + " of " + getSuitString() + " ";

    }

    //for example demonstration purposes
    //write tests to show me all your functions are working
    public static void main(String[] args) {
        Card myQueen = new Card();
//        System.out.println(myQueen.suit);
//        System.out.println(myQueen.value);

        Card card1 = new Card(8,3);
        card1.getSuit();
        card1.getValue();

        card1.getValueString();
        System.out.println();
        System.out.println(card1.toString());
    }
}
