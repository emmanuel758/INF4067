public class Client {
    public static void main(String[] args) {
        Fenetre f = new FenetreSimple();

        // on dessine la fenetre simple
        f.dessiner("Longeur: 10, Largeur: 6");

        // on decrit
        f.decrire();

        // on utilise le decorateur horizontal
        Fenetre dH = new DecorateurCurseurHorizontal(f);

        // on decrit
        dH.decrire();

        // on utilise le decorateur Vertical
        Fenetre dV = new DecorateurCurseurVertical(dH);

        // on decrit
        dV.decrire();

    }
}
