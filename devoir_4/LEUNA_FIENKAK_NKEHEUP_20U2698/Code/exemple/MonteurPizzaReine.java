public class MonteurPizzaReine extends MonteurPizza {

    @Override
    public void monterPatte() {
        pizza.setPate("croisée");
    }

    @Override
    public void monterSauce() {
        pizza.setSauce("douce");
    }

    @Override
    public void monterGarniture() {
        pizza.setGarniture("jambon+champignon");
    }

}
