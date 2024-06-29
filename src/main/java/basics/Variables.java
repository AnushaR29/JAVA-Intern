package basics;
public class Variables {
    String favfood="biriyani"; //Global variable
    static int csecount=180; //static
    public void sree() //Local varaible
    {
        int cosmo=56;
        String name="Anusha";
        System.out.println(cosmo);
        System.out.println(name);
        System.out.println(favfood);
        System.out.println(csecount);
    }
    public static void main(String[] args) {
        System.out.println("Sree");
        //local variable
        //object creation
        //classname objectname=new classmate();
        //calling method
        //objectname.method name
        Variables va=new Variables();
        va.sree();
        System.out.println(csecount);
        String favplace="Paris"; //Instance variable
        System.out.println(favplace);
        }
        }
