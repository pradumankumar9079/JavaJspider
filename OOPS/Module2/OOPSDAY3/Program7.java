/**
 * Program7 Player
 */
class Player {
    int playerId;
    int highScore;

    void play() {
        System.out.println(playerId + " is Playing");
    }

    void exit() {
        System.out.println("Exited Match  and Highest Score is: " + highScore);
    }
}

public class Program7 {
    public static void main(String[] args) {
        // Object for Player1
        Player p1 = new Player();
        p1.playerId = 101;
        p1.highScore = 100;
        p1.play();
        p1.exit();

        // Object for Player2
        Player p2 = new Player();
        p2.highScore = 500;
        p2.playerId = 102;
        p2.play();
        p2.exit();
    }

}