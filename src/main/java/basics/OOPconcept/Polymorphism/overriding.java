package basics.OOPconcept.Polymorphism;

class overriding1
{
  public void CartoonName(String Character1,String Character2)
    {
        if(Character1.equals(Character2))
        {
            System.out.println("Your statement is true");
        }
        else
        {
            System.out.println("Your statement is false");
        }
    }
}

class overriding2
{
    public void CartoonName(String Character1,String Character2)
    {
        if (Character1 == "Shinchan")
        {
            System.out.println("Shinchan is my fav");
        }
        else if (Character2 == "Dora")
        {
            System.out.println("Dora is friend of bujji");

        }
        else
        {
            System.out.println("Shinchan and Dora are friends ");
        }
    }
}

public class overriding
{
    public static void main(String[] args)
    {
      overriding1 ab = new overriding1();
      ab.CartoonName("Shinchan","Dora");
      overriding2 ba = new overriding2();
      ba.CartoonName("Shinchan","Dora");
    }
}
