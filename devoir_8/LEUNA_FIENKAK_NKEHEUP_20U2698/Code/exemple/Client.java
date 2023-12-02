public class Client {
    public static void main(String[] args) {
        Forme c1 = new Cercle(new Bleu());
        Forme r1 = new Rectangle(new Rouge());

        // utilisation du cercle
        c1.colorier();

        // utilisation du rectangle
        r1.colorier();
    }
}
