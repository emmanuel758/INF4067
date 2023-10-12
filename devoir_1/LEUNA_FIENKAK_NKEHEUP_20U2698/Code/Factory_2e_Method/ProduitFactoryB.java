// package devoir_1.LEUNA_FIENKAK_NKEHEUP_20U2698.Code.Factory_2e_Method;
public abstract class ProduitFactoryB {
    public ProduitA geProduitA() {
        return createProduitA();
    }

    protected abstract ProduitA createProduitA();
}
