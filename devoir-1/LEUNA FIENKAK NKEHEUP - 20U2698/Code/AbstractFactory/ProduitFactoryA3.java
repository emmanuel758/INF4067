
public class ProduitFactoryA3 extends ProduitFactoryB {

    @Override
    protected ProduitA createProduitA() {
        return new ProduitA3();
    };

}
