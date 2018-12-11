import java.util.ArrayList;

public class DeckClass {
    private ArrayList<Card> unDealt;
    private ArrayList<Card> Dealt;

    public DeckClass(String[] ranks,String[] suits,int[] pointValues)
    {

      ArrayList<Object> deck=new ArrayList<Object>();
      for(Object n:deck)
      {
          deck.add(ranks);
          deck.add(suits);
          deck.add(pointValues);
      }
    }
}
