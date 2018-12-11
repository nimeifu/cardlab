public class CardClass {
    private String rank;
    private String suit;
    private int pointValue;

    public CardClass(String rank,String suit,int pointValue)
    {
        this.rank=rank;
        this.suit=suit;
        this.pointValue=pointValue;
    }
    public boolean equals(Card otherCard)
    {
        return(Card==otherCard);
    }
    public String toString()
    {
        return(rank +"\n"+suit +"\n" +pointValue  );
    }
}
