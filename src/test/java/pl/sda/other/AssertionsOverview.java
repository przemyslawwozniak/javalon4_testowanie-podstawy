package pl.sda.other;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AssertionsOverview {

    //metoda assertEquals dla obiektow korzysta z metody equals()
    //jesli jej nie zaimplementujemy, porownuje po adresach w pamieci
    //- prawie nigdy nie jest to naszym celem
    @Test
    public void compare_same_phone_numbers() {
        PhoneNumber pn = new PhoneNumber(48, 777111555);
        PhoneNumber pn2 = new PhoneNumber(48, 777111555);

        assertEquals(pn, pn2);
    }

    //porownywanie liczb zmiennoprzecinkownych wymaga zdefiniowania delta
    @Test
    public void compare_floating_point_numbers() {
        assertEquals(1.5, 1.5, 0.0000001);
    }

}
