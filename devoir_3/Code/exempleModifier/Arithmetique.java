package devoir_3.Code.exempleModifier;

public final class Arithmetique {
    private static Arithmetique instance = null;

    // D'autres attributs, classique et non 'static'
    private int x;
    private int y;
    private String nom;

    // Constructeur de l'objet
    private Arithmetique() {
        super();
        this.nom = "Math";
    }

    // un autre constructeur
    private Arithmetique(int x, int y) {
        this.x = x;
        this.y = y;
        this.nom = "Math";
    }

    // un autre constructeur
    private Arithmetique(int x, int y, String nom) {
        this.x = x;
        this.y = y;
        this.nom = nom;
    }

    // Methode renvoyant une instance de la classe
    public static Arithmetique getInstance() {
        if (instance == null)
            instance = new Arithmetique();

        return instance;
    }

    // methode renvoyant une instance de la classe
    public static Arithmetique getInstance(int x, int y) {
        if (instance == null)
            instance = new Arithmetique(x, y);
        return instance;
    }

    // methode renvoyant une instance de la classe
    public static Arithmetique getInstance(int x, int y, String nom) {
        if (instance == null)
            instance = new Arithmetique(x, y, nom);
        return instance;
    }

    // D'autres methodes classiques et non 'static'

    // # somme
    public int somme(int x, int y) {
        return x + y;
    }

    // # moyenne
    public float moyenne(int x, int y) {
        return (float) (x + y) / 2;
    }

    // # multiplication
    public int multiplication(int x, int y) {
        return x * y;
    }

    // # affiche
    public void affiche() {
        System.out.println("\nJe suis une instance. Mes valeurs sont: x = " + this.x + " et y = " + this.y
                + " et nom = " + this.nom);
    }

    // Redefinir la methode clone pour empecher son utilisation
    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    // fin de la classe Arithmetique
}