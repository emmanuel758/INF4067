public class Client {
    public static void main(String[] args) {
        Forme c1 = new Cercle(new Bleu());
        Forme r1 = new Rectangle(new Rouge());

        Forme c2 = new Cercle(new Vert());

        // utilisation du cercle
        c1.colorier();

        // utilisation du rectangle
        r1.colorier();

        // utilisatiion de la couleur verte ajouter
        c2.colorier();
        
    }
}
