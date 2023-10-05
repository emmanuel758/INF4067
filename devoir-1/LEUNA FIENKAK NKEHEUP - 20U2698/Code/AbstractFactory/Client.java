public class Client {
    public static void main(String[] args) {
        ProduitFactoryB produitFactoryA1 = new ProduitFactoryA1();
        ProduitFactoryB produitFactoryA2 = new ProduitFactoryA1();
        ProduitFactoryB produitFactoryA3 = new ProduitFactoryA3();

        ProduitA produitA = null;

        System.out.println("Utilisation de la premiere fabrique");
        produitA = produitFactoryA1.geProduitA();
        produitA.methodA();

        System.out.println("Utilisation de la seconde fabrique");
        produitA = produitFactoryA2.geProduitA();
        produitA.methodA();

        System.out.println("Utilisation de la troisieme fabrique");
        produitA = produitFactoryA3.geProduitA();
        produitA.methodA();

    }
}
