public class Client {
    public static void main(String[] args) {

        // le monteurs / builder
        MonteurPizza monteurPizzaReine = new MonteurPizzaReine();
        MonteurPizza monteurPizzaPiquante = new MonteurPizzaPiquante();

        // le directeur
        Directeur directeur = new Directeur();

        // la pizza a creer
        Pizza pizza = null;

        System.out.println("Montage de la pizza reine");
        directeur.construirePizza(monteurPizzaReine);
        pizza = monteurPizzaReine.getPizza();
        pizza.print();

        System.out.println("Montage de la pizza piquante");
        directeur.construirePizza(monteurPizzaPiquante);
        pizza = monteurPizzaPiquante.getPizza();
        pizza.print();

    }
}
