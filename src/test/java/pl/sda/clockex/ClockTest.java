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
        //given
        c = new Clock(10, 30);
        //when

        //then
        assertEquals(30, c.getMinutes());
        assertEquals(10, c.getHour());
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
        //given

        //when
        c.setHour(23);
        //then
        assertEquals(23, c.getHour());
    }

    @Test
    public void set_minutes_to_min_value() {
        //given

        //when
        c.setMinutes(0);
        //then
        assertEquals(0, c.getMinutes());
    }

    @Test
    public void set_minutes_to_max_value() {
        //when
        c.setMinutes(59);
        //then
        assertEquals(59, c.getMinutes());
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
        //when
        c.setHour(-1);
        //then
        assertEquals(0, c.getHour());
    }

    @Test
    public void set_minutes_above_range() {
        //when
        c.setMinutes(60);
        //then
        assertEquals(59, c.getMinutes());
    }

    @Test
    public void set_minutes_below_range() {
        //when
        c.setMinutes(-1);
        //then
        assertEquals(0, c.getMinutes());
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
        assertEquals(1, c.getHour());
        assertEquals(59, c.getMinutes());
    }

    @Test
    public void add_minutes_01_30_plus_31min_gives_02_01() {
        //given
        c = new Clock(1, 30);
        //when
        c.addMinutes(31);
        //then
        assertEquals(2, c.getHour());
        assertEquals(1, c.getMinutes());
    }

    @Test
    public void add_minutes_01_30_plus_30min_gives_02_00() {
        //given
        c = new Clock(1, 30);
        //when
        c.addMinutes(30);
        //then
        assertEquals(2, c.getHour());
        assertEquals(0, c.getMinutes());
    }

    @Test
    public void add_minutes_23_59_plus_1min_gives_00_00() {
        //given
        c = new Clock(23, 59);
        //when
        c.addMinutes(1);
        //then
        assertEquals(0, c.getHour());
        assertEquals(0, c.getMinutes());
    }

    @Test
    public void add_minutes_22_22_plus_300min_gives_03_22() {
        //given
        c = new Clock(22, 22);
        //when
        c.addMinutes(300);
        //then
        assertEquals(3, c.getHour());
        assertEquals(22, c.getMinutes());
    }
    //--- addHours(), addMinutes()

    //--- addClock
    //@Ignore //ignoruje test
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
        //given:
        c = new Clock(1, 30);
        Clock c2 = new Clock(2, 30);
        //when:
        c.addClock(c2);
        //then:
        assertEquals(4, c.getHour());
        assertEquals(0, c.getMinutes());
    }

    @Test
    public void add_clock_01_30_plus_04_29_gives_05_59() {
        //given:
        c = new Clock(1, 30);
        Clock c2 = new Clock(4, 29);
        //when:
        c.addClock(c2);
        //then:
        assertEquals(5, c.getHour());
        assertEquals(59, c.getMinutes());
    }

    @Test
    public void add_clock_23_30_plus_02_00_gives_01_30() {
        //given:
        c = new Clock(23, 30);
        Clock c2 = new Clock(2, 0);
        //when:
        c.addClock(c2);
        //then:
        assertEquals(1, c.getHour());
        assertEquals(30, c.getMinutes());
    }

    @Test
    public void add_clock_05_00_plus_null_gives_05_00() {
        //given:
        c = new Clock(5, 0);
        //when:
        c.addClock(null);
        //then:
        assertEquals(5, c.getHour());
        assertEquals(0, c.getMinutes());
    }
    //--- addClock

}
