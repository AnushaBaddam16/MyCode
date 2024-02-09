package exceptiontest;

import org.junit.Assert;
import org.junit.Test;
import exception.FileReader;

import java.io.FileNotFoundException;

public class FileReaderTest {
    FileReader fileReader = new FileReader();
    @Test
    public void testFileReader() {
        String output = fileReader.readFile("/Users/anushareddy/Downloads/MyCode/src/main/resources/doc");
        Assert.assertEquals("HiI am Anusha", output);
    }
    @Test
    public void testFileException() {
        Exception exception = Assert.assertThrows(RuntimeException.class,
                () -> fileReader.readFile("data.txt"));
        Assert.assertEquals(exception.getMessage(), "File not found");
    }
}