package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgems dodgems;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5);
    }


    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }

    @Test
    public void hadDefaultPrice() {
        assertEquals(4.50, dodgems.defaultPrice(),0.01);
    }
    @Test
    public void canCheckPriceOver12() {
        Visitor normalPrice = new Visitor(13, 70,10);
        assertEquals(4.50, dodgems.priceFor(normalPrice),0.01);
    }

    @Test
    public void canCheckPriceUnder12() {
        Visitor halfPrice = new Visitor(11, 70,10);
        assertEquals(4.50, dodgems.priceFor(halfPrice),0.01);
    }
}
