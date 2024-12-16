package calc;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.testng.Assert.assertEquals;

public class TestNGEvenOddCheckerTest {

    ByteArrayOutputStream outputStream;
    PrintStream printStream;

    @BeforeMethod
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

        assertEquals(firstLine, expectedLine, "Need text: Enter an Integer number:");
    }

    @Test
    public void evenCheck() {
        assertEquals(EvenOddChecker.check(4), true, "Num must be even, but its odd");
    }

    @Test
    public void checkEvenConsoleText() {
        EvenOddChecker.check(6);

        String evenLine = outputStream.toString().split("\n")[1].trim();
        String expectedLine = "Entered number is even";

        assertEquals(evenLine, expectedLine, "Need text: Entered number is even");
    }

    @Test
    public void oddCheck() {
        assertEquals(EvenOddChecker.check(5), false, "Num must be odd, but its even");
    }

    @Test
    public void checkOddConsoleText() {
        EvenOddChecker.check(3);

        String oddLine = outputStream.toString().split("\n")[1].trim();
        String expectedLine = "Entered number is odd";

        assertEquals(oddLine, expectedLine, "Need text: Entered number is odd");
    }
}
