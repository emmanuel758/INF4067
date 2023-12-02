public class DecorateurCurseurVertical extends DecorateurFenetre {

    public DecorateurCurseurVertical(Fenetre fenetreADecorer) {
        super(fenetreADecorer);
        //TODO Auto-generated constructor stub
    }

    public void dessiner(String propriete){
        this.fenetreADecorer.dessiner(propriete);
    }

    public void dessinerCurseurVertical(){
        
    }

    public void decrire(){
        this.fenetreADecorer.decrire();
        System.out.println(" et je peux scroller verticalement");
    }
    
}
