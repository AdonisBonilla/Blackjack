public class Casino {

    public Card aceOfHearts;

    public Player Jai;

    public Player dealer;

    public Card[] deck;

    public static void main(String[] args) {

        Casino X = new Casino();
    }

    public Casino() {
        System.out.println("Welcome to Lebron James' Casino!");

        deck = new Card[52];

        int door = 0;
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 13; i++) {

                aceOfHearts = new Card(i, j);
                //  aceOfHearts.print();
                deck[door] = aceOfHearts;
                door++;

            }
        }
        shuffle();
        printDeck();

        Jai = new Player(false, 0, false);
        Jai.print();

        dealer = new Player(true, 0, false);
        dealer.print();

    }

    public void printDeck() {
        for (int i = 0; i < deck.length; i++) {
            // System.out.println(deck[i]);
            deck[i].print();
        }

    }

    public void shuffle() {

        for (int i = 0; i < 52; i++){
            int bruh = (int) (Math.random() * 52);

        Card temp = deck[i];
        deck[i] = deck[bruh];
        deck[bruh] = temp;

    }

    }


    }


