public class Game {
    public static void main(String[] args) {
        Player p;
        p = new Xplayer("Ali", "FCB");
        p.play();
        p.jump();
        p =new Yplayer("Mahmoud");
        p.play();
        p.jump();
        p =new Zplayer("Othman");
        p.play();
        p.jump();
    }
}
