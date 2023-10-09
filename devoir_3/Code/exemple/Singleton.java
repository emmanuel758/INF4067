package devoir_3.Code.exemple;

public final class Singleton {
    private static Singleton instance = null;

    // D'autres attributs, classique et non 'static'
    private int x;
    private int y;

    // Constructeur de l'objet
    private Singleton() {
        super();
    }

    // un autre constructeur
    private Singleton(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Methode renvoyant une instance de la classe
    public static Singleton getInstance() {
        if (instance == null)
            instance = new Singleton();

        return instance;
    }

    // methode renvoyant une instance de la classe
    public static Singleton getInstance(int x, int y) {
        if (instance == null)
            instance = new Singleton(x, y);
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

    // # affiche
    public void affiche() {
        System.out.println("\nJe suis une instance. Mes valeurs sont: x = " + this.x + " et y = " + this.y);
    }

    // Redefinir la methode clone pour empecher son utilisation
    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    // fin de la classe Singleton
}