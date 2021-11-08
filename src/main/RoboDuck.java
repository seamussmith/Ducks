package main;

public class RoboDuck extends Duck
{
    public RoboDuck()
    {
        flyBehavior = new RocketBoostedFlying();
    }
    @Override
    public void display() {
        System.out.println("Its a Robo Duck!");
    }
}
