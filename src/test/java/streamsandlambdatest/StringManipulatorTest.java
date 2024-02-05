package streamsandlambdatest;

import org.junit.Assert;
import org.junit.Test;
import streamsandlambda.StringManipulator;

public class StringManipulatorTest{

    StringManipulator letter = new StringManipulator();

    @Test
    public void testCapitalize() {
        String[] str = {"python", "java"};
        String[] compstr = {"Java", "Python"};
        String[] res = letter.capitalizeAndPrintAlphabetically(str);
        Assert.assertArrayEquals(compstr, res);
    }

    @Test
    public void testCapitalize1() {
        String[] str = {"python", "java"};
        String[] compstr = {"Java", "python"};
        String[] res = letter.capitalizeAndPrintAlphabetically(str);
        Assert.assertNotSame(compstr, res);
    }

    @Test
    public void testCapitalize2() {
        String[] str = {null};
        String[] compstr = {null};
        String[] res = letter.capitalizeAndPrintAlphabetically(str);
        Assert.assertArrayEquals(compstr, res);
    }
}
