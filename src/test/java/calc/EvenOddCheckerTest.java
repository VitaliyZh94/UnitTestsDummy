package calc;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class EvenOddCheckerTest {

    ByteArrayOutputStream outputStream;
    PrintStream printStream;

    @Before
    public void getConsoleText() {
        outputStream = new ByteArrayOutputStream();
        printStream = new PrintStream(outputStream);

        System.setOut(printStream);
    }

    @Test
    public void checkConsoleText() {
        EvenOddChecker.check(6);

        String firstLine = outputStream.toString().split("\n")[0].trim();
        String expectedLine = "Enter an Integer number:";

        assertEquals("Need text: Enter an Integer number:", expectedLine, firstLine);
    }

    @Test
    public void evenCheck() {
        assertEquals("Num must be even, but its odd", true, EvenOddChecker.check(4));
    }

    @Test
    public void checkEvenConsoleText() {
        EvenOddChecker.check(6);

        String evenLine = outputStream.toString().split("\n")[1].trim();
        String expectedLine = "Entered number is even";

        assertEquals("Need text: Entered number is even", expectedLine, evenLine);
    }

    @Test
    public void oddCheck() {
        assertEquals("Num must be odd, but its even", false, EvenOddChecker.check(5));
    }

    @Test
    public void checkOddConsoleText() {
        EvenOddChecker.check(3);

        String oddLine = outputStream.toString().split("\n")[1].trim();
        String expectedLine = "Entered number is odd";

        assertEquals("Need text: Entered number is odd", expectedLine, oddLine);
    }
}
