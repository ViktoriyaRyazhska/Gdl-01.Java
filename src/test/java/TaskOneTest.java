import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskOneTest {

    @Test
    public void excecutionTest() {
        assertTrue(TaskOne.getArea(2,4) == 8);
    }

    @Test
    public void excecutionWithNegativeValueTest() {
        assertThrows(Exception.class, () -> {TaskOne.getArea(-2,4); });
    }

}