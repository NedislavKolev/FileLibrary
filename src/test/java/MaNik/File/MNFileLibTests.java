package MaNik.File;

import MaNik.File.MNFileLib;
import org.junit.Test;
import java.io.IOException;
import static org.junit.Assert.assertEquals;

public class MNFileLibTests {

    @Test
     public void  testReadFilePositive() throws IOException {

        MNFileLib lib = new MNFileLib();

        String file_path = "D:\\Manik\\NedkoLibrary\\src\\main\\java\\TestFiles\\read.xml";

        String real_file = lib.readFile(file_path);
        String expected_file = "D:\\Manik\\NedkoLibrary\\src\\main\\java\\TestFiles\\read.xml";

        if (real_file.equals(expected_file)){
            System.out.println("File paths are the same!");
        }
        else {
            System.out.println("Difference found between actual and expected file path");
        }
        assertEquals(expected_file,real_file);
    }

    @Test
    public void  testReadFileNegative() throws IOException {

        MNFileLib lib = new MNFileLib();

        String file_path = "D:\\Manik\\NedkoLibrary\\src\\main\\java\\TestFiles\\read.xml";

        String real_file = lib.readFile(file_path);
        String expected_file = "D:\\Manik\\NedkoLibrary\\src\\main\\java\\TestFiles\\wr.xml";

        if (real_file.equals(expected_file)){
            System.out.println("File paths are the same!");
        }
        else {
            System.out.println("Difference found between actual and expected file path");
        }
        assertEquals(expected_file,real_file);
    }

    @Test
    public void testWriteToFilePositive() throws IOException {
        MNFileLib lib = new MNFileLib();

        String file = "D:\\Manik\\NedkoLibrary\\src\\main\\java\\TestFiles\\write.xml";
        String stream = "ABCD";

        String actual = lib.writeToFile(stream,file);

        String expected = "D:\\Manik\\NedkoLibrary\\src\\main\\java\\TestFiles\\write.xml";

        if (expected.equals(actual)){
            System.out.println("Correct file names");
        }
        else {
            System.out.println("Incorrect file names");
        }
        assertEquals(expected,actual);
    }


    @Test
    public void testWriteToFileNegative() throws IOException {
        MNFileLib lib = new MNFileLib();

        String file = "D:\\Manik\\NedkoLibrary\\src\\main\\java\\TestFiles\\write.xml";
        String stream = "ABCDE";

        String actual = lib.writeToFile(stream,file);

        String expected = "D:\\Manik\\NedkoLibrary\\src\\main\\java\\TestFiles\\rd.xml";

        if (expected.equals(actual)){
            System.out.println("Correct file names");
        }
        else {
            System.out.println("Incorrect file names");
        }
        assertEquals(expected,actual);
    }

}
