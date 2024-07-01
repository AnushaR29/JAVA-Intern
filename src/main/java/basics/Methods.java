package basics;

public class Methods {
    //1.Without return type and without arguments
    public void Kani ()
    {
        System.out.println("Kani is my friend");
    }
    //2.Without return type and with arguments

    public void She (String frnd_name)
    {
        System.out.println(frnd_name + " is good at sports");
    }
    //3.With return type and without arguments
    public int Her ()
    {
        System.out.println("Her hobby is playing judo");
        return 19;
    }
    public static void main(String[] args)
    {
        Methods obj = new Methods();
        obj.Kani();
        obj.She("She");
        int Game = obj.Her();
        System.out.println("She is a National level player at the age of " +Game);
    }
}
