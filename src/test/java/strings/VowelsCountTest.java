package strings;

import junit.framework.Assert;
import org.junit.Test;

import static strings.VowelsCount.countVowels;

public class VowelsCountTest {
    @Test
    public void test1() {
        Assert.assertEquals(2, countVowels("Anusha"));
    }

    @Test
    public void test2(){
        Assert.assertEquals(5,countVowels("aeiou"));
    }

    @Test
    public void test3(){
        Assert.assertEquals(0,countVowels(null));
        //Assert.assertEquals(0,vowelCountMethod(" m "));
    }

}