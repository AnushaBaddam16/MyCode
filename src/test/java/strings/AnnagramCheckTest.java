package strings;

import junit.framework.Assert;
import org.junit.Test;

import static strings.AnagramCheck.areAnagrams;

public class AnnagramCheckTest {

    @Test
    public void test1(){
        Assert.assertEquals(true,areAnagrams("astronomer","moon starer"));
    }

    @Test
    public void test2(){
        Assert.assertEquals(false,areAnagrams(null,null));
    }

    @Test
    public void test3(){
        Assert.assertEquals(false,areAnagrams("silent",null));
    }

    @Test
    public void test4(){
        Assert.assertEquals(false,areAnagrams(null,"listen"));
    }
}

