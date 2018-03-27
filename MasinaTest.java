import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MasinaTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void addComponent() {
    }

    @Test
    void given_car_when_carIsDacia_then_dacia() {
        Masina car = new Masina("dacia", "blue", 1997, 4, 20);
        String color = car.getMarca();
        assert (color == "dacia");
    }

    @Test
    void given_car_when_setMarcaDacia_then_dacia() {
        Masina car = new Masina();
        car.setMarca("dacia");
        assert (car.getMarca()== "dacia");
    }

    @Test
    void given_car_when_carIsBlue_then_blue() {
        Masina car = new Masina("dacia", "blue", 1997, 4, 20);
        String color = car.getCuloare();
        assert (color == "blue");
    }

    @Test
    void given_car_when_setCarCuloareBlue_then_blue() {
        Masina car = new Masina();
        car.setCuloare("Blue");
        assert (car.getMarca() == "Blue");
    }

    @Test
    void given_car_when_carHasAnProd1998_then_1998() {
        Masina car = new Masina("dacia", "blue", 1998, 4, 20);
        int an = car.getAnProductie();
        assert (an == 1998);
    }

    @Test
    void given_car_when_setAnProductie1998_then_1998() {
        Masina car = new Masina();
        car.setAnProductie(1998);
        assert (car.getAnProductie() == 1998);
    }

    @Test
    void getNumarUsi() {
    }

    @Test
    void setNumarUsi() {
    }

    @Test
    void getGarantie() {
    }

    @Test
    void setGarantie() {
    }

    @Test
    void getComponente() {
    }

    @Test
    void setComponente() {
    }
}