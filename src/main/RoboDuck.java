package main;

public class RoboDuck extends Duck
{
    public RoboDuck()
    {
        flyBehavior = new RocketBoostedFlying();
    }
}
