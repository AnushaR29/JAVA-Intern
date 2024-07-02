package basics.OOP;
class Animal
{
    public void speak()
    {
        System.out.println("Animal makes sound");
    }
}
class Cat extends Animal
{
    public void sound1()
    {
        String AnimalName = "Cat";
        System.out.println(AnimalName + " says MEOW...! ");
    }
}
class Cow extends Animal
{
    public void sound2()
    {
        String AnimalName = "Cow";
        System.out.println(AnimalName + " says MOO...!");
    }
}
class Dog extends Animal
{
    public void sound3()
    {
        String AnimalName = "Dog";
        System.out.println(AnimalName + " says BOW...!");
    }
}

public class Hierarchical
{
    public static void main(String[] args)
    {
        Dog ab=new Dog();
        ab.speak();
        ab.sound3();
    }

}
