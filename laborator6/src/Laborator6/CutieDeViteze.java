public class CutieDeViteze implements Componenta{

    private int trepteViteza;
    private boolean automat;
    public CutieDeViteze(){

    }

    public CutieDeViteze(int trepteViteza, boolean automat){
        this.setTrepteViteza(trepteViteza);
        this.setAutomat(automat);
    }

    public int getTrepteViteza() {
        return trepteViteza;
    }

    public void setTrepteViteza(int trepteViteza) {
        this.trepteViteza = trepteViteza;
    }

    public boolean isAutomat() {
        return automat;
    }

    public void setAutomat(boolean automat) {
        this.automat = automat;
    }
}
