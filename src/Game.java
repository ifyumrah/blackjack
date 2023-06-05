public class Game {
    public Card card1;
    public Card[] deck;

    public static void main(String[] args) {
        Game blackjack = new Game();
    }

    public Game() {
        deck = new Card[52];
        System.out.println();
        int curr = 0;
        for (int s = 0; s < 4; s++) {
            for (int n = 1; n<14; n++){
                deck[curr] = new Card(s,n);
                curr++;
            }
        }
//        for (int i = 0; i < deck.length; i++) {
//            deck[i].printCard();
//        }
        shuffle();
    }

    public void restartGame() {

    }

    public void shuffle() {
        Card[] shuffledDeck = new Card[52];

        for (int f = 0; f < shuffledDeck.length; f++) {
            int randomCard = (int) (Math.random() * 52);
            Card shuffleCard = deck[randomCard];
            while(deck[randomCard].isDealt==true){
                 randomCard = (int) (Math.random() * 52);
                 shuffleCard = deck[randomCard];
            }
            deck[randomCard].isDealt =true;
            shuffleCard.printCard();
            shuffledDeck[f] = shuffleCard;
        }
        deck = shuffledDeck;
    }
}
