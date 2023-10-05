
public class ProduitFactoryA1 extends ProduitFactoryB {

    @Override
    protected ProduitA createProduitA() {
        return new ProduitA1();
    };

}
