package main;

public abstract class Duck
{
    IFlyingBehavior flyBehavior;
    public Duck()
    {
    }
    public final void performFly()
    {
        flyBehavior.performFly();
    }
    public final void setFlyBehavior(IFlyingBehavior fly)
    {
        flyBehavior = fly;
    }
    public void swim()
    {
        System.out.println("All ducks swim");
    }
    public abstract void display();
}
