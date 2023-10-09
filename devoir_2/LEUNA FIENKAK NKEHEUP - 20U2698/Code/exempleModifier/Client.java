package devoir_2.Code.exempleModifier;

public class Client {
    public static void main(String[] args) {
        IProduitFactory produitFactory1 = new ProduitFactory1();
        IProduitFactory produitFactory2 = new ProduitFactory2();
        IProduitFactory produitFactory3 = new ProduitFactory3();

        ProduitA produitA = null;
        ProduitB produitB = null;

        System.out.println("Utilisattion de la premiere fabrique");
        produitA = produitFactory1.geProduitA();
        produitB = produitFactory1.geProduitB();
        produitA.methodeA();
        produitB.methodeB();

        System.out.println("Utilisattion de la seconde fabrique");
        produitA = produitFactory2.geProduitA();
        produitB = produitFactory2.geProduitB();
        produitA.methodeA();
        produitB.methodeB();

        System.out.println("Utilisattion de la troisieme fabrique");
        produitA = produitFactory3.geProduitA();
        produitB = produitFactory3.geProduitB();
        produitA.methodeA();
        produitB.methodeB();
    }
}
