public class Element {
    public String nom;
    public String type;

    public Element(String nom, String type) {
        this.nom = nom;
        this.type = type;
    }

    public void decrire() {
        System.out.println("Je suis un élément de nom: " + this.nom + " et de type: " + this.type);
    }
}