package stringstest;

import junit.framework.Assert;
import junit.framework.TestCase;
import strings.VowelsCount;

public class VowelsCountTest extends TestCase {

    public void testVowelCount(){
        int nullresult = VowelsCount.countVowels("");
        Assert.assertEquals(0,nullresult);
        int novowels = VowelsCount.countVowels("bdhgfs");
        Assert.assertEquals(0,novowels);
        int allvowels = VowelsCount.countVowels("aeiou");
        Assert.assertEquals(5,allvowels);
        int uppercasevowels = VowelsCount.countVowels("AEIOU");
        Assert.assertEquals(5,uppercasevowels);
        int mixedvowels = VowelsCount.countVowels("aeiouAEIOU");
        Assert.assertEquals(10,mixedvowels);
    }
}