package main;

public class App
{
    public static void main(String[] args) 
    {
        var ducks = new Duck[] { new MallardDuck(), new RoboDuck() };
        for (var duck : ducks)
        {
            duck.display();
            duck.performFly();
        }
    }
}
