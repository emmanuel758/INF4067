
public class ProduitFactoryA2 extends ProduitFactoryB {

    @Override
    protected ProduitA createProduitA() {
        return new ProduitA2();
    };

}
