package arraylist;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TraverseTest {

    Traverse traverseList = new Traverse();
    @Test
    public void testListSuccess() {
        ArrayList<String> employeeList = new ArrayList<>(Arrays.asList("Rajiv", "Ram", "Raju"));
        List<String> expectedListOutput = Arrays.asList("Rajiv", "Ram", "Raju");
        Assert.assertEquals(expectedListOutput, traverseList.getList(employeeList));
    }

    @Test
    public void testListSuccessEnhanced() {
        ArrayList<String> employeeList = new ArrayList<>(Arrays.asList("Rajiv", "Ram", "Raju"));
        List<String> expectedListOutput = Arrays.asList("Rajiv", "Ram", "Raju");
        Assert.assertEquals(expectedListOutput, traverseList.getListEnhancedForLoop(employeeList));
    }
    @Test
    public void testListFailureEnhanced() {
        ArrayList<String> employeeList = new ArrayList<>(Arrays.asList("Rajiv", "Ram", "Raju"));
        List<String> expectedListOutput = Arrays.asList("Rajiv", "Ram", "Raj");
        Assert.assertNotEquals(expectedListOutput, traverseList.getList(employeeList));
        Assert.assertNotEquals(expectedListOutput, traverseList.getListEnhancedForLoop(employeeList));
    }
}