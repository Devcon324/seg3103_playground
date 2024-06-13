import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DateTest {

    @Test
    void nextDate_tc01() {
        Date today = new Date(1700, 6, 20);
        Date expectedTomorrow = new Date(1700, 6, 21);
        assertEquals(expectedTomorrow, today.nextDate());
    }

    @Test
    void nextDate_tc02() {
        Date today = new Date(2005, 4, 15);
        Date expectedTomorrow = new Date(2005, 4, 16);
        assertEquals(expectedTomorrow, today.nextDate());
    }

    @Test
    void nextDate_tc03() {
        Date today = new Date(1901, 7, 20);
        Date expectedTomorrow = new Date(1901, 7, 21);
        assertEquals(expectedTomorrow, today.nextDate());
    }

    @Test
    void nextDate_tc04() {
        Date today = new Date(3456, 3, 27);
        Date expectedTomorrow = new Date(3456, 3, 28);
        assertEquals(expectedTomorrow, today.nextDate());
    }

    @Test
    void nextDate_tc05() {
        Date today = new Date(1500, 2, 17);
        Date expectedTomorrow = new Date(1500, 2, 18);
        assertEquals(expectedTomorrow, today.nextDate());
    }

    @Test
    void nextDate_tc06() {
        Date today = new Date(1700, 6, 29);
        Date expectedTomorrow = new Date(1700, 6, 30);
        assertEquals(expectedTomorrow, today.nextDate());
    }

    @Test
    void nextDate_tc07() {
        Date today = new Date(1800, 11, 29);
        Date expectedTomorrow = new Date(1800, 11, 30);
        assertEquals(expectedTomorrow, today.nextDate());
    }

    @Test
    void nextDate_tc08() {
        Date today = new Date(3453, 1, 29);
        Date expectedTomorrow = new Date(3453, 1, 30);
        assertEquals(expectedTomorrow, today.nextDate());
    }

    @Test
    void nextDate_tc09() {
        Date today = new Date(444, 2, 29);
        Date expectedTomorrow = new Date(444, 3, 1);
        assertEquals(expectedTomorrow, today.nextDate());
    }

    @Test
    void nextDate_tc10() {
        Date today = new Date(2005, 4, 30);
        Date expectedTomorrow = new Date(2005, 5, 1);
        assertEquals(expectedTomorrow, today.nextDate());
    }

    @Test
    void nextDate_tc11() {
        Date today = new Date(3453, 1, 30);
        Date expectedTomorrow = new Date(3453, 1, 31);
        assertEquals(expectedTomorrow, today.nextDate());
    }

    @Test
    void nextDate_tc12() {
        Date today = new Date(3456, 3, 30);
        Date expectedTomorrow = new Date(3456, 3, 31);
        assertEquals(expectedTomorrow, today.nextDate());
    }

    @Test
    void nextDate_tc13() {
        Date today = new Date(1901, 7, 31);
        Date expectedTomorrow = new Date(1901, 8, 1);
        assertEquals(expectedTomorrow, today.nextDate());
    }

    @Test
    void nextDate_tc14() {
        Date today = new Date(3453, 1, 31);
        Date expectedTomorrow = new Date(3453, 2, 1);
        assertEquals(expectedTomorrow, today.nextDate());
    }

    @Test
    void nextDate_tc15() {
        Date today = new Date(3456, 12, 31);
        Date expectedTomorrow = new Date(3457, 1, 1);
        assertEquals(expectedTomorrow, today.nextDate());
    }

    @Test
    void nextDate_invalid_tc16() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new Date(1500, 2, 31));
    }

    @Test
    void nextDate_invalid_tc17() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new Date(1500, 2, 29));
    }

    @Test
    void nextDate_invalid_tc18() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new Date(-1, 10, 20));
    }

    @Test
    void nextDate_invalid_tc19() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new Date(1458, 15, 12));
    }

    @Test
    void nextDate_invalid_tc20() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new Date(1975, 6, -50));
    }

    // Exercise 1: add tests
    // Test cases for setDay()
    // cant have a 32nd day on a month
    @Test
    void nextDate_invalid_setDay() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new Date(2000, 3, 32));
    }

    // cant have 31st on a month with 30 days
    @Test
    void nextDate_invalid_setDay2() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new Date(2000, 4, 31));
    }

    // cant have 30th day on a month with 29 days (leap year)
    @Test
    void nextDate_invalid_setDay3() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new Date(2014, 2, 30));
    }

    // cant have 29th day on a month with 28 days
    @Test
    void nextDate_invalid_setDay4() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new Date(2013, 2, 29));
    }

    // check if the next day is set correctly, non leap year
    @Test
    void nextDate_endOfFebNonLeap() {
        Date today = new Date(2021, 2, 28);
        Date expectedTomorrow = new Date(2021, 3, 1);
        assertEquals(expectedTomorrow, today.nextDate());
    }

    // check if the next day is set correctly, leap year
    @Test
    void nextDate_endOfFebLeap() {
        Date today = new Date(2020, 2, 28);
        Date expectedTomorrow = new Date(2020, 2, 29);
        assertEquals(expectedTomorrow, today.nextDate());
    }

    // missing september in tests
    @Test
    void nextDate_9month() {
        Date today = new Date(1901, 9, 1);
        Date expectedDayAfter = new Date(1901, 9, 2);
        assertEquals(expectedDayAfter, today.nextDate());
    }

    // compare date with object
    @Test
    void nextDate_equality1() {
        Object obj = new Object();
        Date date = new Date(2000, 3, 17);
        assertFalse(date.equals(obj));
    }

    // compare date with date wrong year month day
    @Test
    void nextDate_equality2() {
        Date date = new Date(2000, 3, 17);
        Date date2 = new Date(2001, 4, 18);
        assertFalse(date.equals(date2));
    }

    // compare date with date wrong month day
    @Test
    void nextDate_equality3() {
        Date date = new Date(2000, 3, 17);
        Date date2 = new Date(2000, 4, 18);
        assertFalse(date.equals(date2));
    }

    // compare date with date wrong day
    @Test
    void nextDate_equality4() {
        Date date = new Date(2000, 3, 17);
        Date date2 = new Date(2000, 3, 18);
        assertFalse(date.equals(date2));
    }

    // compare date with date wrong year day
    @Test
    void nextDate_equality5() {
        Date date = new Date(2000, 3, 17);
        Date date2 = new Date(2001, 3, 18);
        assertFalse(date.equals(date2));
    }

    // compare date with date wrong year month
    @Test
    void nextDate_equality6() {
        Date date = new Date(2000, 3, 17);
        Date date2 = new Date(2001, 4, 17);
        assertFalse(date.equals(date2));
    }

    // compare date with date correct
    @Test
    void nextDate_equality7() {
        Date date = new Date(2000, 3, 17);
        Date date2 = new Date(2000, 3, 17);
        assertTrue(date.equals(date2));
    }

    // ToString was not tested before
    @Test
    void nextDate_toString() {
        Date date = new Date(2000, 3, 17);
        assertEquals("2000/March/17", date.toString());
    }

    // check if the next day is set correctly, non leap year for year%400=0 year
    @Test
    void nextDate_isLeapYear_true() {
        Date today = new Date(2000, 2, 29);
        Date expectedDayAfter = new Date(2000, 3, 1);
        assertEquals(expectedDayAfter, today.nextDate());
    }

}