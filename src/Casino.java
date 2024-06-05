import java.util.Scanner;

public class Casino {

    public Card aceOfHearts;

public Player Jai;

    public Player dealer;

    public Card[] deck;

    public int counter;

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
       // printDeck();


        Jai = new Player(false, 0, false);


        dealer = new Player(true, 0, false);

        deal();

        Jai.print();
        dealer.print();

        //https://www.theserverside.com/tutorial/How-Javas-Systemin-reads-input-from-the-user

        System.out.println("Would you like to hit or stand?");

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();





        while (name.equals ("hit") && Jai.isBust==false){

            System.out.println("you chose to hit, good choice!");
            Jai.cardsSum = Jai.cardsSum + deck[counter].value;
           counter = counter +1 ;
                    System.out.println("The player now has " +Jai.cardsSum+ " points.");

            Jai.print();

            if(Jai.isBust==false){
                System.out.println ("Would you like to hit again?") ;

             name = scanner.nextLine();

            }

        }

        while (dealer.cardsSum<17){
            dealer.cardsSum = dealer.cardsSum + deck[counter].value;
            counter = counter +1 ;

            System.out.println("The dealer must hit, he now has " +dealer.cardsSum+ " points");




        }

        if(name.equals("stand")){

            if(dealer.cardsSum<17){

                dealer.cardsSum = dealer.cardsSum + deck[counter].value;
                counter = counter +1 ;

                System.out.println("The dealer now has " +dealer.cardsSum+ " points.");


            }else{
                System.out.println("The dealer remains at "+ dealer.cardsSum+ " points.");

            }

            System.out.println("you chose to stand, good choice!");

            System.out.println("The player remains at " +Jai.cardsSum+ " points.");




        }

    }

    public void deal(){
        Jai.hand[0] = deck[0];
        Jai.hand[1] = deck[1];
    Jai.cardsSum = Jai.hand[1].value + Jai.hand[0].value;

        dealer.hand[0] = deck[2];
        dealer.hand[1] = deck[3];

        dealer.cardsSum = dealer.hand[0].value + dealer.hand[1].value ;

        counter = 4;

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


