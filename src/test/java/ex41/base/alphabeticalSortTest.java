package ex41.base;

import junit.framework.TestCase;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class alphabeticalSortTest extends TestCase {

    public void testSortFunction() {
        List<String> sortedList = new ArrayList<String>();
        sortedList.add("g");
        sortedList.add("b");
        sortedList.add("a");
        sortedList.add("c");
        sortedList.sort(String.CASE_INSENSITIVE_ORDER);
        //Copy the array to sort and then to compare with original
        List<String> testList = new ArrayList<String>();
        testList.add("a");
        testList.add("b");
        testList.add("c");
        testList.add("g");

        Assert.assertEquals(sortedList, testList);
    }
}
