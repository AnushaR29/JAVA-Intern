package basics.OOP;
class Air
{
    public void Oxygen ()
    {
        System.out.println("We get oxygen from trees");
    }
}
class Water extends Air
{
    public void H2O ()
    {
        System.out.println("We get water from Rain");
    }
}
class Food extends Water
{
    public void food ()
    {
        System.out.println("We get food by Farming");
    }
}


public class Multilevel
{
    public static void main(String[] args)
    {
        Food ab=new Food();
        ab.Oxygen();
        ab.H2O();
        ab.food();
    }

}
