package main;

public class MallardDuck extends Duck
{
    public MallardDuck()
    {
        this.flyBehavior = new WingedFlying();
    }
    @Override
    public void display() {
        System.out.println("Its a Mallard Duck!");
    }
}
