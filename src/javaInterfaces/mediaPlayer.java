package javaInterfaces;

public class mediaPlayer implements Media {

    @Override
    public void start() {
        System.out.println("playing the music..");
    }

    @Override
    public void stop() {
        System.out.println("music is stoped ");
    }
}
