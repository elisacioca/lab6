import org.junit.Test;

import static org.junit.Assert.*;

public class CutieDeVitezeTest {

    @Test
    public void given_number_when_trepte_is_greater_than0_and_lower_than_8() {
        CutieDeViteze cutieDeViteze = new CutieDeViteze(3,true);
        assert(cutieDeViteze.getTrepteViteza() >= 0 && cutieDeViteze.getTrepteViteza() < 8);
    }

    @Test
    public void given_number_when_setTrepte_is_5() {
        CutieDeViteze cutieDeViteze = new CutieDeViteze();
        cutieDeViteze.setTrepteViteza(5);
        assert (cutieDeViteze.getTrepteViteza() == 5);
    }

    @Test
    public void given_automat_when_automat_is_true() {
        CutieDeViteze cutieDeViteze = new CutieDeViteze(1,true);
        assert(cutieDeViteze.isAutomat());
    }

    @Test
    public void given_automat_when_setAutomat_is_false() {
        CutieDeViteze cutieDeViteze = new CutieDeViteze();
        cutieDeViteze.setAutomat(false);
        assert(!cutieDeViteze.isAutomat());
    }
}