package basics.OOPconcept;

abstract class price
{
    public void stationaries (String item1,String item2)
    {
        System.out.println("Scale is cheaper than Pen");
    }
    public abstract void price(int item1,int item2);
    public abstract void additional(int item1,int item2);
}

class Item extends price
{

    @Override
    public void price(int item1, int item2)
    {
      int add = item1+item2;
      System.out.println("Price of both items " +add );
    }

    @Override
    public void additional(int item1, int item2)
    {
      System.out.println("Price of pen " +item1);
      System.out.println("Price of Scale " +item2);
    }

    public static void main(String[] args)
    {
        Item ab=new Item();
        ab.additional(10,50);
        ab.price(50,10);
        ab.stationaries("Pen","Scale");
    }
}
