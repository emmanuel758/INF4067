public class FenetreSimple implements Fenetre {

    public String propriete;

    @Override
    public void dessiner(String propriete) {
        this.propriete = propriete;
    }

    @Override
    public void decrire() {
        System.out.println("=====================================\nJe suis une fenetre simple: " + this.propriete);
    }

}
