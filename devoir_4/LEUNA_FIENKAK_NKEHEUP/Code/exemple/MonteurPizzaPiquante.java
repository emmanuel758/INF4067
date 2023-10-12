package devoir_4.LEUNA_FIENKAK_NKEHEUP.Code.exemple;

public class MonteurPizzaPiquante extends MonteurPizza {

    @Override
    public void monterPatte() {
        pizza.setPate("feuilletée");
    }

    @Override
    public void monterSauce() {
        pizza.setSauce("piquante");
    }

    @Override
    public void monterGarniture() {
        pizza.setGarniture("pepperoni+salami");
    }

}
