package basics.OOP.Multiple;

public class Hotel extends Meals implements MorningTiffen,Lunch,NightDinner
{

    @Override
    public void lunch() {
        System.out.println("Meals is ready");
    }

    @Override
    public void tiffen() {
        System.out.println("Idly is my fav tiffen");
    }

    @Override
    public void dinner() {
        System.out.println("Mostly I prefer fast food for Dinner");
    }
    public static void main(String[] args)
    {
        Hotel ab=new Hotel();
        ab.lunch();
        ab.tiffen();
        ab.dinner();
    }
}
