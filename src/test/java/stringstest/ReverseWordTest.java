package stringstest;

import junit.framework.Assert;
import junit.framework.TestCase;
import strings.ReverseWord;

public class ReverseWordTest extends TestCase{
    public void testReverse(){
        String nullresult = ReverseWord.reverseWords("");
        Assert.assertEquals("",nullresult);
        String result = ReverseWord.reverseWords("Java J2EE Reverse Me");
        Assert.assertEquals("avaJ EE2J esreveR eM",result);
        String singleword = ReverseWord.reverseWords("Java");
        Assert.assertEquals("avaJ",singleword);
        //handling false case
        String falseresult = ReverseWord.reverseWords("Java J2EE Reverse Me");
        Assert.assertNotSame("avaJ J2EE esreveR eM",falseresult);



    }
}