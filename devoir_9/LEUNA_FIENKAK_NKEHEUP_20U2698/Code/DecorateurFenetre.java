public class DecorateurFenetre implements Fenetre {

    protected Fenetre fenetreADecorer;

    @Override
    public void dessiner(String propriete) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'dessiner'");
    }

    @Override
    public void decrire() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'decrire'");
    }

    public DecorateurFenetre(Fenetre fenetreADecorer) {
        this.fenetreADecorer = fenetreADecorer;
    }

}
