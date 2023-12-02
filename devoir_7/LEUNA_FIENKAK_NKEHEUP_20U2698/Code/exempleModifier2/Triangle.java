public class Triangle extends Forme {
    public Triangle(Couleur c) {
        super(c);
    }

    public void colorier() {
        System.out.println("Triangle colorier avec la couleur ");
        this.c.remplir();
    }
}
