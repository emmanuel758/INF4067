public class RectangleImpCarree extends Rectangle implements Carree {

    @Override
    public void setCote(float c) {
        setLargeur(c);
        setLongueur(c);
    }

}
