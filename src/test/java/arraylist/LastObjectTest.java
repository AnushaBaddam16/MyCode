package arraylist;
import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;

public class LastObjectTest {
    LastObject lastObject = new LastObject();

    /*
     * Success case for removing the last object.
     */
    @Test
    public void testRemoveLastSuccess() {
        ArrayList<String> employeeList = new ArrayList<>(Arrays.asList("Rajiv", "Ram"));
        employeeList = lastObject.removeLastObject(employeeList);
        Assert.assertEquals(Arrays.asList("Rajiv"), employeeList);
        employeeList = lastObject.removeLastObject(employeeList);
        Assert.assertTrue(employeeList.isEmpty());
    }

    /*
     * Failure case where we are trying to remove the element from an empty list.
     */
    @Test
    public void testRemoveLastFailure() {
        ArrayList<String> employeeList = new ArrayList<>();
        lastObject.removeLastObject(employeeList);
        Assert.assertTrue(employeeList.isEmpty());
    }

    /*
     * Edge case
     * Passing the null list into the method. This should return the output without any exception.
     */
    @Test
    public void testRemoveLastEdge() {
        lastObject.removeLastObject(null);
    }

}