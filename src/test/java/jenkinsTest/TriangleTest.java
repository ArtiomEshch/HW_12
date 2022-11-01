package jenkinsTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import utils.Triangle;

import java.util.stream.Stream;



import static org.junit.jupiter.params.provider.Arguments.arguments;

class TriangleTest {
    @DisplayName("utils.Triangle square calculation test")

    @ParameterizedTest
    @MethodSource("getSquareDataProvider")
    public void getSquareTest(double a, double b, double c, double expected) {
        Triangle triangle = new Triangle(a, b, c);
        Assertions.assertEquals(expected, Triangle.getSquare(triangle));
    }

    static Stream<Arguments> getSquareDataProvider() {
        return Stream.of(
                arguments(1.5, 2.5, 3, 1.8708286933869707),
                arguments(465.1, 279.2, 279.3, 35952.15395869902),
                arguments(13, 10, 21, 48.744230427815765),
                arguments(5.657, 11.8543, 13.34553, 33.50088597153446)
        );
    }
}