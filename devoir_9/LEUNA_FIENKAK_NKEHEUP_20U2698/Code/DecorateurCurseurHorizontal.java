public class DecorateurCurseurHorizontal extends DecorateurFenetre {

    public DecorateurCurseurHorizontal(Fenetre fenetreADecorer) {
        super(fenetreADecorer);
        //TODO Auto-generated constructor stub
    }

    public void dessiner(String propriete){
        this.fenetreADecorer.dessiner(propriete);
    }

    public void dessinerCurseurHorizontal(){
        
    }

    public void decrire(){
        this.fenetreADecorer.decrire();
        System.out.println(" et je peux scroller horizontalement");
    }
    
}
