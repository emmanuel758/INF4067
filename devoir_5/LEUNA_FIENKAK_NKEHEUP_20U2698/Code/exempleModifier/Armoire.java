
public class Armoire extends Meuble {

    @Override
    public Meuble Copy() {
        Armoire armoire = new Armoire();
        armoire.couleur = this.couleur;
        return armoire;
    }

    @Override
    public void affiche() {
        System.out.println("Je suis un armoire de couleur " + this.couleur);
    }

}
