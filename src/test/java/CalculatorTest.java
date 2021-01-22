import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @Test
    public void plus() {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(calculator.plus(1, 2), 3);
        Assertions.assertEquals(calculator.plus(3, 4), 7);
    }

    @Test
    public void minus() {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(calculator.minus(5, 3), 2);
    }
}
