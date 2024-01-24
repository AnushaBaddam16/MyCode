package strings;

import org.junit.Assert;
import org.junit.Test;

import static strings.RotationCheck.isRotation;

public class RotationCheckTest {

    @Test
    public void test1(){
        Assert.assertEquals(true,isRotation("JavaJ2eeStrutsHibernate","StrutsHibernateJavaJ2ee"));
    }

    @Test
    public void test2(){
        Assert.assertEquals(false,isRotation("JavaJ2eeStruts","StrutsHibernateJavaJ2ee"));
    }

    @Test
    public void test3(){
        Assert.assertEquals(true,isRotation("JavaJ2ee StrutsHibernate","StrutsHibernateJavaJ2ee "));
    }

    @Test
    public void test4(){
        Assert.assertEquals(false,isRotation(null,null));
    }

    @Test
    public void test5(){
        Assert.assertEquals(false,isRotation("manoj",null));
    }
}