package measurement;

import exception.IdiotTeacherException;
import exception.IllegalComparisonException;
import org.hamcrest.CoreMatchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static junit.framework.Assert.assertTrue;
import static junit.framework.TestCase.assertEquals;

public class MeasurementTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void compareComparesOneFeetIsEqualsToTwelveInches() throws Exception {
        Measurement feet = new Measurement(1, LengthUnit.FEET);
        Measurement inch = new Measurement(12.0, LengthUnit.INCH);
        assertTrue(feet.compare(inch));
    }

    @Test
    public void compareComparesOneInchIsEqualsToTwoPointFiveCentimeter() throws Exception {
        Measurement feet = new Measurement(1, LengthUnit.INCH);
        Measurement inch = new Measurement(2.50, LengthUnit.CM);
        assertTrue(feet.compare(inch));
    }

    @Test
    public void compareComparesOneCentimeterIsEqualsToTenMillimeter() throws Exception {
        Measurement feet = new Measurement(1, LengthUnit.CM);
        Measurement inch = new Measurement(10, LengthUnit.MM);
        assertTrue(feet.compare(inch));
    }

    @Test
    public void compareComparesOneGallonIsEqualToThreePointSevenEightLitre() throws Exception {
        Measurement gallon = new Measurement(1, VolumeUnit.GALLON);
        Measurement litre = new Measurement(3.78, VolumeUnit.LITRE);
        assertTrue(gallon.compare(litre));

    }

    @Test
    public void addAddedTwoInchesAndGivesFour() throws Exception {
        Measurement feet = new Measurement(2, LengthUnit.INCH);
        Measurement inch = new Measurement(2, LengthUnit.INCH);
        Measurement expected = new Measurement(4, LengthUnit.INCH);
        assertEquals(expected, feet.add(inch));
    }

    @Test
    public void addAddedTwoInchAndTwoPointFiveCentimeterAndGivesThree() throws Exception {
        Measurement feet = new Measurement(2, LengthUnit.INCH);
        Measurement inch = new Measurement(2.5, LengthUnit.CM);
        Measurement expected = new Measurement(3, LengthUnit.INCH);
        assertEquals(expected, feet.add(inch));
    }

    @Test
    public void compareCanNotUnequalPhysicalQuantity() throws Exception {
        thrown.expect(IllegalComparisonException.class);
        thrown.expectMessage(CoreMatchers.is("Can't compare unequal physical quantity"));

        Measurement inch = new Measurement(1, LengthUnit.INCH);
        Measurement gallon = new Measurement(1, VolumeUnit.GALLON);
        inch.compare(gallon);
    }

    @Test
    public void addAddedOneGallonAndOneLitreAndGivesFourLitre() throws Exception {
        Measurement gallon = new Measurement(1, VolumeUnit.GALLON);
        Measurement litre = new Measurement(1, VolumeUnit.LITRE);
        Measurement expected = new Measurement(4.78, VolumeUnit.LITRE);
        assertEquals(expected, gallon.add(litre));
    }


    @Test
    public void addAddedOneInchAndOneGallonAndGivesOneGallon() throws Exception {
        thrown.expect(IdiotTeacherException.class);
        thrown.expectMessage(CoreMatchers.is("My Teacher is an idiot"));

        Measurement inch = new Measurement(1, LengthUnit.INCH);
        Measurement gallon = new Measurement(1, VolumeUnit.GALLON);
        inch.add(gallon);
    }

    @Test
    public void equalCheckWhetherTwoObjectsAreEqualsAreNot() throws Exception {
        Measurement feet = new Measurement(2, LengthUnit.INCH);
        Measurement inch = new Measurement(2.5, LengthUnit.CM);
        Measurement expected = new Measurement(3, LengthUnit.INCH);
        assertTrue(expected.equals(feet.add(inch)));

    }
}