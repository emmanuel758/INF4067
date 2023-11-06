public class Client {
    public static void main(String[] args) {

        // utilisation de l'adaptateur
        Carree c = new RectangleImpCarree();

        c.setCote(5);

        // affichage
        c.affiche();
    }
}
