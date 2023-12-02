
// import pour utiliser la classe ArrayList
import java.util.*;

public class Dossier extends Element {

    // liste des fils du dossier
    private ArrayList<Element> fils = new ArrayList<>();

    public Dossier(String nom, String type) {
        super(nom, type);
    }

    /**
     * Ajoute un element e au dossier
     * 
     * @param e
     */
    public void ajouter(Element e) {
        this.fils.add(e);
    }

    /**
     * Supprimer un element e du dossier
     * 
     * @param e
     */
    public void supprimer(Element e) {
        if (this.fils.contains(e)) {
            this.fils.remove(e);
        } else {
            System.out.println("L'élément n'est pas dans le dossier");
        }
    }

    /**
     * Retourne le dernier element du dossier
     * 
     * @return
     */
    public Element obtenir() {
        if (this.fils.size() > 0) {
            return fils.get(fils.size() - 1);
        } else {
            System.out.println("Le dossier est vide");
        }
    }

    public void decrire() {

        // on execute d'abord le contenu de la methode decrire de la classe Element
        super.decrire();

        // puis on affiche la description des fils
        if (this.fils.size() > 0) {
            for (int i = 0; i < this.fils.size(); i++) {
                this.fils.get(i).decrire();
            }
        } else {
            System.out.println("Le dossier est vide");
        }
    }

}
