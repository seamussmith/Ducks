package main;

public class MallardDuck extends Duck
{
    public MallardDuck()
    {
        this.flyBehavior = new WingedFlying();
    }
}
