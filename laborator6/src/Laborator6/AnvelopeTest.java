import org.junit.Test;

import static org.junit.Assert.*;

public class AnvelopeTest {

    @Test
    public void given_diametru_when_diametru_is_positive() {
        Anvelope anvelopa = new Anvelope(100,1);
        assert (anvelopa.getDiametru()>0);
    }

    @Test
    public void given_diametru_when_SetDiametru_is_100() {
        Anvelope anvelopa = new Anvelope();
        anvelopa.setDiametru(100);
        assert (anvelopa.getDiametru() == 100);
    }

    @Test
    public void given_anotimp_when_anotimp_is_1() {
        Anvelope anvelopa = new Anvelope(100,1);
        assert(anvelopa.getAnotimp() == 1);
    }

    @Test
    public void given_anotimp_when_SetAnotimp_is_in_range() {
        Anvelope anvelopa = new Anvelope();
        anvelopa.setAnotimp(2);
        assert (anvelopa.getAnotimp() >= 1 && anvelopa.getAnotimp() <= 4);
    }


}