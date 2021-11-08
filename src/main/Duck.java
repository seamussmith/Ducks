package main;

public abstract class Duck
{
    FlyingBehavior flyBehavior;
    public Duck()
    {
    }
    public void performFly()
    {
        flyBehavior.performFly();
    }
    public void swim()
    {
        System.out.println("All ducks swim");
    }
}
