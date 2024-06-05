public class Player {
    //isdealer
    public boolean isDealer;

    //sum of cards
    public int cardsSum;

    //is bust
    public boolean isBust;

    // the players cards
    public Card[] hand;


    public Player(boolean pIsDealer, int pCardSum, boolean pIsBust) {
        isDealer = pIsDealer;
        cardsSum = pCardSum;
        isBust = pIsBust;
        hand = new Card[2];


    }


    public void print() {


        if (isDealer) {
            System.out.println("The dealer has " + cardsSum + " points.");

        } else {
            System.out.println("The player has " + cardsSum + "points. ");


        }

        if (cardsSum>21){

            isBust = true;
            System.out.println("YOU HAVE BUSTEDD! YOU LOSE!");
        } else {

          isBust = false;

        }





        for(int i=0; i<hand.length; i++){
            hand[i].print();
        }


    }

}