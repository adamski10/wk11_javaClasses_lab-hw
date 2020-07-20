import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    private Printer printer;

    @Before
    public void before() {
        this.printer = new Printer(100, 100);
    }

    @Test
    public void canPrintIfEnoughSheets() {
        printer.print(10,1);
        assertEquals(90, printer.getSheets());
    }

    @Test
    public void canNotPrintIfNotEnoughSheets() {
        printer.print(101, 1);
        assertEquals(100, printer.getSheets());
    }

    @Test
    public void canReduceToner() {
        printer.print(10, 1);
        assertEquals(90, printer.getToner());
    }
}
