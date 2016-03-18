package shape;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/*
job of shape.SquareTest is to test behaviour of shape.Square.fir
 */
public class SquareTest {
        Square square;

        @Before
        public void setUp() throws Exception {
            double side = 4d;
            square = Square.createSquare(side);
        }

        @Rule
        public ExpectedException thrown = ExpectedException.none();

        @Test
        public void square_throws_exception_for_non_positive_side() throws Exception {
            double side = -2;
            thrown.expect(IllegalArgumentException.class);
            thrown.expectMessage("Non positive input is provided side: -2.0 while creating square");
            Square.createSquare(side);
        }

        @Test
        public void square_throws_exception_if_any_of_given_side_is_zero() throws Exception {
            double side = 0;
            thrown.expect(IllegalArgumentException.class);
            thrown.expectMessage("Non positive input is provided side: 0.0 while creating square");
            Square.createSquare(side);
        }
}