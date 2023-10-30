public class Table extends Meuble {
    @Override
    public Meuble Copy() {
        Table table = new Table();
        table.couleur = this.couleur;
        return table;
    }

    @Override
    public void affiche() {
        System.out.println("Je suis une table de couleur " + this.couleur);
    }

}
