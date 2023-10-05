public abstract class ProduitFactoryB {
    public ProduitA geProduitA() {
        return createProduitA();
    }

    protected abstract ProduitA createProduitA();
}
