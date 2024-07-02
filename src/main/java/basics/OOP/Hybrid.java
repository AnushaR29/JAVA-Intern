package basics.OOP;
class Movie
{
    public void Theri()
    {
        System.out.println("Theri is heart touching movie");
    }
}
interface Rerelease
{
    public void Ghilli();
}
interface Hit
{
    public void Shajahan();
}
class Blockbuster extends Movie implements Rerelease,Hit
{

    @Override
    public void Shajahan() {
        System.out.println("Shajahan is a hit movie");
    }

    @Override
    public void Ghilli() {
        System.out.println("Ghilli is Rereleased movie");
    }
}
public class Hybrid
{
    public static void main(String[] args)
    {
        Blockbuster ab=new Blockbuster();
        System.out.println("Vijay is my fav Hero");
        ab.Theri();
        ab.Shajahan();
        ab.Ghilli();

    }
}
