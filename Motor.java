public class Motor implements Componenta {
    private int Putere;
    private int Turatie;
    private int CapacitateCilindrica;
    private String Combustibil;

    public Motor(int _Putere, int _Turatie, int _CapacitateCilindrica, String _Combustibil)
    {
        _Putere = Putere;
        _Turatie = Turatie;
        _CapacitateCilindrica = CapacitateCilindrica;
        _Combustibil = Combustibil;
    }


    public int getPutere() {
        return Putere;
    }

    public void setPutere(int _putere) {
        Putere = _putere;
    }

    public int getTuratie() {
        return Turatie;
    }

    public void setTuratie(int _turatie) {
        Turatie = _turatie;
    }

    public int getCapacitateCilindrica() {
        return CapacitateCilindrica;
    }

    public void setCapacitateCilindrica(int _capacitateCilindrica) {
        CapacitateCilindrica = _capacitateCilindrica;
    }

    public String getCombustibil() {
        return Combustibil;
    }

    public void setCombustibil(String _combustibil) {
        Combustibil = _combustibil;
    }
}
