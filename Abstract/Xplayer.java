public class Xplayer extends Player {
    String campName;

    Xplayer(String name, String campName) {
        super(name);
        this.campName = campName;
    }

    public void play() {
        System.out.println("xplayer playing now!");
    }

    public void jump() {
        System.out.println("xplayer jumping now!");
    }
}
