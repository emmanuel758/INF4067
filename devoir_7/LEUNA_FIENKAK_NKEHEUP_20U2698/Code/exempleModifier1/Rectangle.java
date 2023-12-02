public class Rectangle extends Forme {
    public Rectangle(Couleur c) {
        super(c);
    }

    public void colorier() {
        System.out.println("Rectangle colorier avec la couleur ");
        this.c.remplir();
    }
}
