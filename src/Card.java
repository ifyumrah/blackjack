public class Card {
    public String suit;
    public String name;
    public int value;
    public boolean isDealt;

    public Card (int pSuit, int pName){
        if(pSuit == 0){
            suit = "Diamonds";
        }
        if(pSuit == 1){
            suit = "Hearts";
        }
        if(pSuit == 2){
            suit = "Spades";
        }
        if(pSuit == 3){
            suit = "Clubs";
        }
        if(pName == 0){
            name = "1";
        }
        if(pName == 1){
            name = "2";
        }
        if(pName == 2){
            name = "3";
        }
        if(pName == 3){
            name = "4";
        }
        if(pName == 4){
            name = "5";
        }
        if(pName == 5){
            name = "6";
        }
        if(pName == 6){
            name = "7";
        }
        if(pName == 7){
            name = "8";
        }
        if(pName == 8){
            name = "9";
        }
        if(pName == 9){
            name = "10";
        }

        System.out.println("This is the " + name + " of " + suit);

    }

    public void printCard() {
        System.out.println();
    }
}
