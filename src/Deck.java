
import java.util.ArrayList;

public class Deck {
    private ArrayList<Card> unDealt;
    private ArrayList<Card> Dealt;

    public Deck(String[] ranks, String[] suits, int[] pointValues)
    {
        unDealt=new ArrayList<Card>();
        Dealt=new ArrayList<Card>();

      for(int x=0;x<ranks.length;x++)
      {
          for(int y=0;y<suits.length;y++)
          {
              Card c = new Card(ranks[x],suits[y],pointValues[x]);
              unDealt.add(c);
          }
      }
    }
}
