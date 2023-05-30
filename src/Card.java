public class Card {
    public String suit;
    public String name;
    public int value;
    public boolean isDealt;

    public Card (int pSuit, int pName){
        if(pSuit == 0){
            suit = "Diamond";
        }
        if(pSuit == 1){
            suit = "Heart";
        }
    }
}
