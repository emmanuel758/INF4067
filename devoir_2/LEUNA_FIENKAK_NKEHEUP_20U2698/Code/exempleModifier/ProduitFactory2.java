// package devoir_2.LEUNA_FIENKAK_NKEHEUP_20U2698.Code.exempleModifier;

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
