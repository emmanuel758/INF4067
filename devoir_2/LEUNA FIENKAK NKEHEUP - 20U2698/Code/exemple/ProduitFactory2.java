package devoir_2.Code.exemple;

public class ProduitFactory2 implements IProduitFactory {

    @Override
    public ProduitA geProduitA() {
        return new ProduitA2();
    }

    @Override
    public ProduitB geProduitB() {
        return new ProduitB2();
    }

}
