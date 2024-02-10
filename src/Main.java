public class Main {
    public static void main(String[] args) {
        //IN YO FACE TESTING I JUST DID THIS ALL BLIND ALL IN MY HEAD NO TESTING AT ALL YEAAAAH BABYYYY

        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] numbers = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        String[][] deckOfCards = new String[4][13];
        for(int i = 0; i < 4; i++){
            for (int j = 0; j < 13; j++){
                deckOfCards[i][j] = numbers[j] + " of " + suits[i];
            }
        }
        String[] hands = {"Hand A: ", "Hand B: ", "Hand C: ", "Hand D: "};
        for(int hand = 0; hand < 4; hand++){
            for(int card = 0; card < 5; card++){
                //grab random card from deck
                int randomSuit = (int)(Math.random()*4);
                int randomNumber = (int)(Math.random()*13);
                String randomCard = deckOfCards[randomSuit][randomNumber];
                while (randomCard == null){
                    randomSuit = (int)(Math.random()*4);
                    randomNumber = (int)(Math.random()*13);
                    randomCard = deckOfCards[randomSuit][randomNumber];
                }
                //take it out of the deck
                deckOfCards[randomSuit][randomNumber] = null;
                //give it to one of the players with concatenation
                hands[hand] += "\n " + randomCard;
            }
        }
        for (int i = 0; i < hands.length; i++){
            System.out.println(hands[i]);
        }

    }
}