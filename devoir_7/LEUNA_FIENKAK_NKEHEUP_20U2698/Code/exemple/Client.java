
public class Client {
    public static void main(String[] args) {
        Fichier f1 = new Fichier("fichier1", "TXT");
        Fichier f2 = new Fichier("fichier2", "PDF");

        Dossier d1 = new Dossier("dossier1", "REPERTOIRE");
        Dossier d2 = new Dossier("dossier2", "REPERTOIRE");

        // utilisation de decrire() sur un fichier
        f1.decrire();

        // utilisation de decrire sur un dossier vide
        d1.decrire();

        // utilisation de ajouter() sur un dossier
        d1.ajouter(f1);
        d1.ajouter(f2);
        d2.ajouter(f1);
        d1.ajouter(d2);

        // utilisation de decrire surun dossier non vide
        d1.decrire();

        // utilisation de supprimer sur un dossier
        d1.supprimer(f2);

        // utilisation de obtenir sur un dossier
        d2.obtenir();

        //

    }

}
