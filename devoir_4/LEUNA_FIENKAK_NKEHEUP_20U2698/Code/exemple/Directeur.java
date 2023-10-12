public class Directeur {

    public void construirePizza(MonteurPizza builder) {
        builder.creerNouvellePizza();
        builder.monterPatte();
        builder.monterSauce();
        builder.monterGarniture();
    }
}
