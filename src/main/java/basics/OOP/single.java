package basics.OOP;
class family
{
    public void ab ()
    {
        String FatherName="RajeshKumar.R";
        String MotherName="Anitha.K";
        System.out.println("My FatherName is RajeshKumar.R");
        System.out.println("My MotherName is Anitha.K");
    }

}
class bond extends family
{
    public void ba ()
    {
        String Myself="Anusha.R";
        String BrotherName="Anshith.R";
        System.out.println("Myself Anusha.R");
        System.out.println("My BrotherName is Anshith.R");
    }
}

public class single
{
    public static void main(String[] args)
    {
        bond anu=new bond();
        anu.ab();
        anu.ba();

    }
}
