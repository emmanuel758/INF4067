package devoir_4.LEUNA_FIENKAK_NKEHEUP.Code.exemple;

public abstract class MonteurPizza {
    protected Pizza pizza;

    public Pizza getPizza() {
        return pizza;
    }

    public void creerNouvellePizza() {
        pizza = new Pizza();
    }

    public abstract void monterPatte();

    public abstract void monterSauce();

    public abstract void monterGarniture();
}
