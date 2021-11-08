package main;

public class WingedFlying implements IFlyingBehavior
{
    @Override
    public void performFly() {
        System.out.println("Flap flap!");
    }
}
