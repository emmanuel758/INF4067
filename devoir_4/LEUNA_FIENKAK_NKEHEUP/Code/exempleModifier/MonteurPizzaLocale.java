public class MonteurPizzaLocale extends MonteurPizza {

    @Override
    public void monterPatte() {
        pizza.setPate("Taro");
    }

    @Override
    public void monterSauce() {
        pizza.setSauce("Sauce aux 22 condiments");
    }

    @Override
    public void monterGarniture() {
        pizza.setGarniture("Escargot");
    }

}
