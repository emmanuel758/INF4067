public class Cercle extends Forme {
    public Cercle(Couleur c) {
        super(c);
    }

    public void colorier() {
        System.out.println("Cercle colorier avec la couleur ");
        this.c.remplir();
    }
}
