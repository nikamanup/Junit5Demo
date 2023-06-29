package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;
import org.junit.platform.commons.util.StringUtils;

import java.time.Month;
import java.util.EnumSet;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DemoTest {


    @ParameterizedTest(name = "for test {index} name in parameter was {0}")
    @ValueSource(strings = {"Anup"})
    public void testValuesource(String string){
        assertEquals("Anup",string);
    }

    @ParameterizedTest(name = "for test {index} Month name in parameter was {0}")
    @EnumSource(value = Month.class,names = {"JANUARY","FEBRUARY","MARCH","APRIL","MAY","JULY","JUNE","AUGUST"}, mode = EnumSource.Mode.EXCLUDE)
    public void testENUMsource(Month month){
        EnumSet<Month> months =
                EnumSet.of(Month.SEPTEMBER, Month.OCTOBER, Month.NOVEMBER, Month.DECEMBER);
        assertTrue(months.contains(month));
    }


    @ParameterizedTest(name = "{index} Testing using csv file for value {0},{1}")
    @CsvFileSource(resources = "/data.csv",numLinesToSkip = 1)
    public void testCSVFIleSource(String input, String expected){
        String actualValue = input.toUpperCase();
        assertEquals(expected, actualValue);
    }

    @ParameterizedTest(name = "{index} Testing using csv file for value {0},{1}")
    @CsvSource({"test,TEST", "tEst,TEST", "Java,JAVA"})
    public void testCSVSource(String input, String expected){
        String actualValue = input.toUpperCase();
        assertEquals(expected, actualValue);
    }

    @ParameterizedTest(name = " Value for empty String is {0}")
    @ArgumentsSource(StringArgumentProvider.class)
    public void should_Return_True_forNULL_or_Blank(String string){
        assertTrue(StringUtils.isBlank(string));

    }
}
