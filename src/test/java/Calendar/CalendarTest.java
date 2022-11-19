package Calendar;

import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

public class CalendarTest {

    @Test
    public void monthTest(){
        Calendar calendar  = new Calendar();
        String result = calendar.printDate("19/11/2022");
        assertEquals(result, "19 NOVEMBER 2022");
    }

    @Test
    public void incrementTest(){
        Calendar calendar = new Calendar();
        String result = calendar.IncrementDate("19/11/2022");
        assertEquals(result, "Next date is 20 NOVEMBER 2022");

        result = calendar.IncrementDate("31/12/2022");
        assertEquals(result, "Next date is 1 JANUARY 2023");

        result = calendar.IncrementDate("30/11/2022");
        assertEquals(result, "Next date is 1 DECEMBER 2022");

    }

    @Test
    public void LeapYearTest(){
        Calendar calendar = new Calendar();
        String result = calendar.IncrementDate("28/02/2020");
        assertEquals(result , "Next date is 29 FEBRUARY 2020");

        result = calendar.IncrementDate("28/02/2022");
        assertFalse(!Objects.equals(result, "Next date is 29 FEBRUARY 2022"));
    }
}
