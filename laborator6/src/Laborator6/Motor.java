package Laborator6;

public class Motor implements Componenta {
    private int Putere;
    private int Turatie;
    private int CapacitateCilindrica;
    private String Combustibil;

    public Motor (){
        
    }
    
    public Motor(int _Putere, int _Turatie, int _CapacitateCilindrica, String _Combustibil)
    {
        this.Putere = _Putere;
        this.Turatie = _Turatie;
        this.CapacitateCilindrica = _CapacitateCilindrica;
        this.Combustibil = _Combustibil;
    }


    public int getPutere() {
        return Putere;
    }

    public void setPutere(int _putere) {
        this.Putere = _putere;
    }

    public int getTuratie() {
        return Turatie;
    }

    public void setTuratie(int _turatie) {
        this.Turatie = _turatie;
    }

    public int getCapacitateCilindrica() {
        return CapacitateCilindrica;
    }

    public void setCapacitateCilindrica(int _capacitateCilindrica) {
        this.CapacitateCilindrica = _capacitateCilindrica;
    }

    public String getCombustibil() {
        return Combustibil;
    }

    public void setCombustibil(String _combustibil) {
        this.Combustibil = _combustibil;
    }
}
