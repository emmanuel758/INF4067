public class Rectangle {
    private float longueur;
    private float largeur;

    public void setLongueur(float longueur) {
        this.longueur = longueur;
    }

    public void setLargeur(float largeur) {
        this.largeur = largeur;
    }

    public float perimetre() {
        return (this.longueur + this.largeur) * 2;
    }

    public float aire() {
        return this.longueur * this.largeur;
    }

    public void affiche() {
        System.out.println("Mon perimetre est de: " + perimetre() + " et mon aire est de: " + aire());
    }
}
