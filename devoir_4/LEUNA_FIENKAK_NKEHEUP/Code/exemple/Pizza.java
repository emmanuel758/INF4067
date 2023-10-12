package devoir_4.LEUNA_FIENKAK_NKEHEUP.Code.exemple;

public class Pizza {
    private String pate = "";
    private String sauce = "";
    private String garniture = "";

    public void setPate(String pate) {
        this.pate = pate;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setGarniture(String garniture) {
        this.garniture = garniture;
    }

    public void print() {
        System.out.println(this.toString());
        System.out.println("pate = " + pate + "\nSauce = " + sauce + "\nGarniture = " + garniture);
    }

}
