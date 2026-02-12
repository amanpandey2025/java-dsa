package javaInterfaces;

public class carEngine implements Engine {

    @Override
    public void start() {
        System.out.println("car is started");

    }

    @Override
    public void stop() {
        System.out.println("car is stoped...");
    }

    @Override
    public void acc() {
        System.out.println("car is running...");

    }
}
