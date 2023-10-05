public class Client {
    public static void main(String[] args) {
        ProduitFactory produitFactory = new ProduitFactory();

        ProduitA produitA = null;

        produitA = produitFactory.geProduitA(ProduitFactory.TYPE_PRODUITA1);
        produitA.methodA();

        produitA = produitFactory.geProduitA(ProduitFactory.TYPE_PRODUITA2);
        produitA.methodA();

    }
}
