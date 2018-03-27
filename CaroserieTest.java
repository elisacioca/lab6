import org.junit.Test;

import static org.junit.Assert.*;

public class CaroserieTest {

    @Test
    public void given_culoare_when_culoare_is_red() {
        Caroserie caroserie = new Caroserie("red","wood");
        assert(caroserie.getCuloare().equals("red"));
    }

    @Test
    public void given_culoare_when_setCuloare_is_white() {
        Caroserie caroserie = new Caroserie();
        caroserie.setCuloare("white");
        assert(caroserie.getCuloare().equals("white"));
    }

    @Test
    public void given_material_when_material_is_paper() {
        Caroserie caroserie = new Caroserie("black","paper");
        assert(caroserie.getMaterial().equals("paper"));
    }

    @Test
    public void given_material_when_setMaterial_is_aluminium() {
        Caroserie caroserie = new Caroserie();
        caroserie.setMaterial("aluminium");
        assert(caroserie.getMaterial().equals("aluminium"));
    }
}