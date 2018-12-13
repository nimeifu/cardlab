
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

    public boolean isEmpty()
    {
        if(Dealt.size() ==0 && unDealt.size()==0)
        {
            return true;
        }
        return false;
    }

    public int size()
    {
        return unDealt.size();
    }

    public Card deal()
    {
        if(unDealt.size() ==0)
        {
            return null;
        }
        unDealt.remove(unDealt.get(0));
        Dealt.add(Dealt.get(0));
        return unDealt.get(0);
    }

    public void shuffle()
    {
        for(int i=0;i<Dealt.size();i++)
        {
            unDealt.add(Dealt.get(i));
            Dealt.remove(i);
        }

   int r;
        for(int k=51;k<=1;k++)
    {
        r = (int) (Math.random() * 51);
       





    }
}
