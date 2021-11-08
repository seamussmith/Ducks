package main;

public class WingedFlying implements FlyingBehavior
{
    @Override
    public void performFly() {
        System.out.println("Flap flap!");
    }
}
