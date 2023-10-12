// package devoir_1.LEUNA_FIENKAK_NKEHEUP_20U2698.Code.Factory_1ere_Method;
public class Client {
    public static void main(String[] args) {
        ProduitFactory produitFactory = new ProduitFactory();

        ProduitA produitA = null;

        produitA = produitFactory.geProduitA(ProduitFactory.TYPE_PRODUITA1);
        produitA.methodA();

        produitA = produitFactory.geProduitA(ProduitFactory.TYPE_PRODUITA2);
        produitA.methodA();

        produitA = produitFactory.geProduitA(ProduitFactory.TYPE_PRODUITA3);
        produitA.methodA();

    }
}
