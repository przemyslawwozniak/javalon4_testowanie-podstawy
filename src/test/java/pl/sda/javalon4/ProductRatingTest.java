package pl.sda.javalon4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProductRatingTest {

    ProductRating pr = new ProductRating();

    @Test
    public void create() {
        //ProductRating pr = new ProductRating();
        assertEquals("Initial Product Rating should be equal to 3.", 3, pr.getScore());
    }

    @Test
    public void user_sets_score_in_lower_range() {
        //given - warunki poczatkowe testu
        //ProductRating pr = new ProductRating();

        //when - akcja ktora dzieje sie w tescie - testowana funkcjonalnosc
        pr.setScore(1);

        //then - rezultat, ktorego sie spodziewamy
        assertEquals("Product Rating, when set within range, is correctly assigned to 'score' field.",
                1, pr.getScore());
    }

    @Test
    public void user_sets_score_in_upper_range() {

    }

    @Test
    public void user_sets_score_under_lower_range() {

    }

    @Test
    public void user_sets_negative_score() {

    }

    @Test
    public void user_sets_score_above_upper_range() {

    }

}
