// package devoir_2.LEUNA_FIENKAK_NKEHEUP_20U2698.Code.exempleModifier;

public class ProduitFactory1 implements IProduitFactory {

    @Override
    public ProduitA geProduitA() {
        return new ProduitA1();
    }

    @Override
    public ProduitB geProduitB() {
        return new ProduitB1();
    }

}
