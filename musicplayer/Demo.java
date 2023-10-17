package musicplayer;

/**
 * Demo class. Everything comes together here.
 */
public class Demo {
    public static void main(String[] args) {
        Player player = new Player();

        player.getState().onPlay();
        player.getState().onNext();
        player.getState().onPrevious();

    }
}