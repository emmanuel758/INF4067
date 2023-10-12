package devoir_4.LEUNA_FIENKAK_NKEHEUP.Code.exemple;

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
