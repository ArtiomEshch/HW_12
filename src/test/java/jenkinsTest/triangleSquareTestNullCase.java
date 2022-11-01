package jenkinsTest;

import org.junit.jupiter.api.Test;
import utils.Triangle;

import static org.junit.jupiter.api.Assertions.*;

class triangleSquareTestNullCase {

    @Test
    public void exceptionSquareTest() {
        assertThrows(NullPointerException.class, () -> Triangle.getSquare(new Triangle(2, 4, 6)));
    }

    @Test
    public void nullSquareTest() {
        Triangle triangle = null;
        assertThrows(NullPointerException.class, () -> Triangle.getSquare(triangle));
    }
}