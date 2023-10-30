public class Client {
    public static void main(String[] args) {
        Meuble m1 = new Chaise();
        Meuble m2 = new Table();

        m1.couleur = "Rouge";
        m2.couleur = "Noir";

        // utilisation du prototype 1 (chaise)
        Meuble m11 = m1.Copy();
        m11.affiche();

        // utilisation du prototype 2 (table)
        Meuble m22 = m2.Copy();
        m22.affiche();
    }
}
