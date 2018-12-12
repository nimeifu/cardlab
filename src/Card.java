public class Card {
    private String rank;
    private String suit;
    private int pointValue;

    public Card(String rank, String suit, int pointValue)
    {
        this.rank=rank;
        this.suit=suit;
        this.pointValue=pointValue;
    }
    public boolean equals(Card otherCard)
    {
        return(this.pointValue==otherCard.pointValue);
    }
    public String toString()
    {
        return("rank: "+rank +"\t"+"suit: "+suit +"\t" +"pointValue: "+pointValue);
    }
}
