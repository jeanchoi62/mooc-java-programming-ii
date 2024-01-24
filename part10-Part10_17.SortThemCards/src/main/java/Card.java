

public class Card implements Comparable<Card>{

    private int value;
    private Suit suit;

    public Card(int value, Suit suit) {
        if (value < 2 || value > 14) {
            throw new IllegalArgumentException("Card value must be in range 2...14.");
        }
        this.value = value;
        this.suit = suit;
    }

    @Override
    public int compareTo(Card c) {
        if (this.value == c.value) {
            if (this.suit == Suit.CLUB) {
                if (c.suit == Suit.CLUB) {
                    return 0;
                } else {
                    return -1;
                }
            } else if (this.suit == Suit.DIAMOND) {
                if (c.suit == Suit.CLUB) {
                    return 1;
                } else if (c.suit == Suit.DIAMOND) {
                    return 0;
                } else {
                    return -1;
                }
            } else if (this.suit == Suit.HEART) {
                if (c.suit == Suit.HEART) {
                    return 0;
                } else if (c.suit == Suit.CLUB || c.suit == Suit.DIAMOND) {
                    return 1;
                } else {
                    return -1;
                }
            } else if (this.suit == Suit.SPADE) {
                if (c.suit == Suit.SPADE) {
                    return 0;
                } else {
                    return 1;
                }
            }
            
        } else if (this.value > c.value) {
            return 1;
        } 
        return -1;
    }

    @Override
    public String toString() {
        String cardValue = "" + value;
        if(value == 11) {
            cardValue = "J";
        } else if (value == 12) {
            cardValue = "Q";
        } else if (value == 13) {
            cardValue = "K";
        } else if (value == 14) {
            cardValue = "A";
        }

        return suit + " " + cardValue;
    }

    public int getValue() {
        return value;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }
}