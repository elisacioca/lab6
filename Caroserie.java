
public class Caroserie implements Componenta {

    private String Culoare;
    private String Material;

    public Caroserie(String _culoare, String _material) {
        Culoare = _culoare;
        Material = _material;
    }


    public String getCuloare() {
        return Culoare;
    }

    public void setCuloare(String _culoare) {
        Culoare = _culoare;
    }

    public String getMaterial() {
        return Material;
    }

    public void setMaterial(String _material) {
        Material = _material;
    }
}
