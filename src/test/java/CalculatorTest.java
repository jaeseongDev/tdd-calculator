import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void plus() {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(calculator.plus(1, 2), 3);
    }
}
