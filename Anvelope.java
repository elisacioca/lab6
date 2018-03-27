
public class Anvelope implements Component {
    private int Diametru;
    private int Anotimp;


   public Anvelope(int _Diametru, int _Anotimp)
    {
        Diametru=_Diametru;
        Anotimp=_Anotimp;

    }


    public int getDiametru() {
        return Diametru;
    }

    public void setDiametru(int _diametru) {
        Diametru = _diametru;
    }

    public int getAnotimp() {
        return Anotimp;
    }

    public void setAnotimp(int _anotimp) {
        Anotimp = _anotimp;
    }
}

