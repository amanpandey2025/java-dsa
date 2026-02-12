package javaInterfaces;

public class Car implements Break,Engine{

    @Override
    public void brake() {
        System.out.println("i break like BMW");
    }

    @Override
    public void start() {
        System.out.println(" rocked is ready to launch....");

    }

    @Override
    public void stop() {
        System.out.println("turning of BMW .....");
    }

    @Override
    public void acc() {
        System.out.println("i am very fast because i am BMW");
    }
}
