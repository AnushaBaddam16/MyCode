package stringstest;

import junit.framework.Assert;
import junit.framework.TestCase;
import strings.AnagramCheck;

public class AnagramCheckTest extends TestCase {
    public void testAnagram() {
        boolean nullresult = AnagramCheck.areAnagrams(null, null);
        Assert.assertFalse(nullresult);
        boolean notlen = AnagramCheck.areAnagrams("less", "les");
        Assert.assertFalse(notlen);
        boolean equal = AnagramCheck.areAnagrams("silent", "listen");
        Assert.assertTrue(equal);
        boolean uppercaseequal = AnagramCheck.areAnagrams("silent", "liSTen");
        Assert.assertTrue(uppercaseequal);
    }
}