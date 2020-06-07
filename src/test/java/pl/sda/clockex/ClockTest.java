package pl.sda.clockex;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClockTest {

    Clock c = new Clock();

    //--- create
    @Test
    public void create_and_initialize_to_00_00() {
        //given

        //when

        //then
        assertEquals(0, c.getMinutes());
        assertEquals(0, c.getHour());
    }

    @Test
    public void create_and_set_initial_time() {

    }
    //--- create

    //--- in range
    @Test
    public void set_hour_to_min_value() {
        //given
        c = new Clock(0, 59);
        //when
        c.setHour(0);
        //then
        assertEquals(0, c.getHour());
    }

    @Test
    public void set_hour_to_max_value() {

    }

    @Test
    public void set_minutes_to_min_value() {

    }

    @Test
    public void set_minutes_to_max_value() {

    }
    //--- in range
    //--- out of range
    @Test
    public void set_hour_above_range() {
        //given

        //when
        c.setHour(50);
        //then
        assertEquals(23, c.getHour());
    }

    @Test
    public void set_hour_below_range() {

    }

    @Test
    public void set_minutes_above_range() {

    }

    @Test
    public void set_minutes_below_range() {

    }
    //--- out of range

    //--- addHours(), addMinutes()
    @Test
    public void add_minutes_01_30_plus_29min_gives_01_59() {
        //given
        c = new Clock(1, 30);
        //when
        c.addMinutes(29);
        //then
        assertEquals(59, c.getMinutes());
        assertEquals(1, c.getHour());
    }

    @Test
    public void add_minutes_01_30_plus_31min_gives_02_01() {

    }

    @Test
    public void add_minutes_01_30_plus_30min_gives_02_00() {

    }

    @Test
    public void add_minutes_23_59_plus_1min_gives_00_00() {

    }

    @Test
    public void add_minutes_22_22_plus_300min_gives_03_22() {

    }
    //--- addHours(), addMinutes()

    //--- addClock
    @Ignore //ignoruje test
    @Test
    public void add_clock_01_30_plus_01_30_gives_03_00() {
        //given:
        c = new Clock(1, 30);
        Clock c2 = new Clock(1, 30);
        //when:
        c.addClock(c2);
        //then:
        assertEquals(3, c.getHour());
        assertEquals(0, c.getMinutes());
    }

    @Test
    public void add_clock_01_30_plus_02_30_gives_04_00() {

    }

    @Test
    public void add_clock_01_30_plus_04_29_gives_05_59() {

    }

    @Test
    public void add_clock_23_30_plus_02_00_gives_01_30() {

    }

    @Test
    public void add_clock_05_00_plus_null_gives_05_00() {

    }
    //--- addClock

}
