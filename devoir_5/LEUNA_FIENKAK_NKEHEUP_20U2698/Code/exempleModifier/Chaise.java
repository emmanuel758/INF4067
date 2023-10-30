
public class Chaise extends Meuble {

    @Override
    public Meuble Copy() {
        Chaise chaise = new Chaise();
        chaise.couleur = this.couleur;
        return chaise;
    }

    @Override
    public void affiche() {
        System.out.println("Je suis une chaise de couleur " + this.couleur);
    }

}
