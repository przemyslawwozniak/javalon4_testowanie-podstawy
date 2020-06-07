package pl.sda.javalon4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProductRatingWithExceptionsTest {

    ProductRatingWithExceptions pr = new ProductRatingWithExceptions();

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
        //given


        //when
        pr.setScore(5);

        //then
        assertEquals("Product Rating, when set within range, is correctly assigned to 'score' field.",
                5, pr.getScore());
    }

    @Test(expected = IllegalArgumentException.class)
    public void user_sets_score_under_lower_range() {
        //given


        //when
        pr.setScore(0); //juz tu leci wyjatek i test nie powinien byc kontynuowany

        //then
        /*assertEquals("Product Rating, when set below range, is reset to min possible value (1)",
                1, pr.getScore());*/
    }

    @Test(expected = IllegalArgumentException.class)
    public void user_sets_negative_score() {
        //given


        //when
        pr.setScore(-1);

        //then
        /*assertEquals("Product Rating, when set to negative value, is reset to min possible value (1)",
                1, pr.getScore());*/
    }

    @Test(expected = IllegalArgumentException.class)
    public void user_sets_score_above_upper_range() {
        //given


        //when
        pr.setScore(6);

        //then
        /*assertEquals("Product Rating, when set to above range, is reset to max possible value (5)",
                5, pr.getScore());*/
    }

}
